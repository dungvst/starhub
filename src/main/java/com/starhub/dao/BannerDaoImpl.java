/**
 * 
 */
package com.starhub.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.starhub.common.CommonConstant;
import com.starhub.model.Banner;

/**
 * @author DungNV
 *
 */
@Repository("bannerDao")
public class BannerDaoImpl extends AbstractDAO<Integer, Banner> implements BannerDao {

    @Override
    public void updateBanner(Banner banner) {
        update(banner);
    }

    @Override
    public Banner getDefaultBanner() {
        Criteria criteria = createEntityCriteria();
        criteria.setMaxResults(1);
        criteria.add(Restrictions.eq("status", CommonConstant.ACTIVE));
        return (Banner) criteria.uniqueResult();
    }

}
