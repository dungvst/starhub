/**
 * 
 */
package com.starhub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.starhub.dao.ImageDao;
import com.starhub.model.Image;

/**
 * @author DungNV
 *
 */
@Repository("imageService")
@Transactional
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageDao imageDao;

    @Override
    public Image updateImage(Image image) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Image getDefaultImage() {
        return imageDao.getDefaultImage();
    }

}
