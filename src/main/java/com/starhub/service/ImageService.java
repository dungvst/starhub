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

    Image updateImage(Image image);

    Image getDefaultImage();
}
