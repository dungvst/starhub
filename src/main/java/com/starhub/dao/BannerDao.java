/**
 * 
 */
package com.starhub.dao;

import com.starhub.model.Banner;

/**
 * @author DungNV
 *
 */
public interface BannerDao {
    Banner updateBanner(Banner banner);

    Banner findById(int id);
}
