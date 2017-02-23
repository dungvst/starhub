/**
 * 
 */
package com.starhub.dao;

import org.springframework.stereotype.Repository;

import com.starhub.model.Banner;

/**
 * @author DungNV
 *
 */
@Repository("bannerDao")
public class BannerDaoImpl extends AbstractDAO<Integer, Banner> implements BannerDao {

    @Override
    public Banner updateBanner(Banner banner) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Banner findById(int id) {
        return getByKey(id);
    }

}
