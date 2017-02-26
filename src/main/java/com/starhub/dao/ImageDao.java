/**
 * 
 */
package com.starhub.dao;

import com.starhub.model.Image;

/**
 * @author DungNV
 *
 */
public interface ImageDao {

    Image updateImage(Image image);

    Image getDefaultImage();
}
