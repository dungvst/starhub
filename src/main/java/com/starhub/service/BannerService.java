/**
 * 
 */
package com.starhub.service;

import com.starhub.model.Banner;

/**
 * @author DungNV
 *
 */
public interface BannerService {
    Banner updateBanner(Banner banner);

    Banner getDefaultBanner();
}
