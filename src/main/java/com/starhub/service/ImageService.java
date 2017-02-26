/**
 * 
 */
package com.starhub.service;

import com.starhub.model.Image;

/**
 * @author DungNV
 *
 */
public interface ImageService {

    void updateImage(Image image);

    Image getDefaultImage();
}
