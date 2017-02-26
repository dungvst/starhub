/**
 * 
 */
package com.starhub.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.starhub.common.CommonConstant;
import com.starhub.model.Image;

/**
 * @author DungNV
 *
 */
@Repository("imageDao")
public class ImageDaoImpl extends AbstractDAO<Integer, Image> implements ImageDao {

    @Override
    public void updateImage(Image image) {
        update(image);
    }

    @Override
    public Image getDefaultImage() {
        Criteria criteria = createEntityCriteria();
        criteria.setMaxResults(1);
        criteria.add(Restrictions.eq("status", CommonConstant.ACTIVE));
        return (Image) criteria.uniqueResult();
    }

}
