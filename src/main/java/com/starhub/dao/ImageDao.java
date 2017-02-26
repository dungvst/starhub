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

    void updateImage(Image image);

    Image getDefaultImage();
}
