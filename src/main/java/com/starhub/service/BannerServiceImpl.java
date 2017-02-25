/**
 * 
 */
package com.starhub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.starhub.dao.BannerDao;
import com.starhub.model.Banner;

/**
 * @author DungNV
 *
 */
@Service("bannerService")
@Transactional
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerDao bannerDao;

    @Override
    public Banner updateBanner(Banner banner) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Banner getDefaultBanner() {
        return bannerDao.getDefaultBanner();
    }

}
