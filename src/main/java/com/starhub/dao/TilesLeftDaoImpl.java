/**
 * 
 */
package com.starhub.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.starhub.common.CommonConstant;
import com.starhub.model.TilesLeft;

/**
 * @author DungNV
 *
 */
@Repository("tilesLeftDao")
public class TilesLeftDaoImpl extends AbstractDAO<Integer, TilesLeft> implements TilesLeftDao {

    @Override
    public TilesLeft updateTilesLeft(TilesLeft tilesLeft) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TilesLeft getDefaultTilesLeft() {
        Criteria criteria = createEntityCriteria();
        criteria.setMaxResults(1);
        criteria.add(Restrictions.eq("status", CommonConstant.ACTIVE));
        return (TilesLeft) criteria.uniqueResult();
    }

}
