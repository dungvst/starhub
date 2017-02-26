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

    void updateBanner(Banner banner);

    Banner getDefaultBanner();
}
