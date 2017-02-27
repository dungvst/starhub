/**
 * 
 */
package com.starhub.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.starhub.common.CommonConstant;

/**
 * @author DungNV
 *
 */
@Repository("imageService")
@Transactional
public class ImageServiceImpl implements ImageService {

    @Override
    public String uploadImage(MultipartFile file) {
        if (!file.isEmpty()) {
            // Upload image
            String fileName = file.getOriginalFilename();
            String[] splitFileName = fileName.split("\\.");
            String fileType = splitFileName[splitFileName.length - 1].toLowerCase();
            if (fileType.equals("png") || fileType.equals("jpg") || fileType.equals("jpeg")) {
                try {
                    String rootPath = System.getProperty("catalina.home");
                    byte[] bytes = file.getBytes();
                    Path path = Paths.get(rootPath + File.separator + CommonConstant.SERVER_IMG_FOLDER + file.getOriginalFilename());
                    Files.write(path, bytes);
                } catch (IOException e) {
                    return "err.upload";
                }
            } else {
                return "err.upload.fileType";
            }

        }
        return null;
    }
}
