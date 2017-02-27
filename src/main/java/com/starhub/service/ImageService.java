/**
 * 
 */
package com.starhub.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author DungNV
 *
 */
public interface ImageService {
    String uploadImage(MultipartFile file);
}
