/**
 * 
 */
package com.starhub.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.starhub.common.CommonConstant;
import com.starhub.model.TilesRight;

/**
 * @author DungNV
 *
 */
@Repository("tilesRightDao")
public class TilesRightDaoImpl extends AbstractDAO<Integer, TilesRight> implements TilesRightDao {

    @Override
    public void updateTilesRight(TilesRight tilesRight) {
        update(tilesRight);
    }

    @Override
    public TilesRight getDefaultTilesRight() {
        Criteria criteria = createEntityCriteria();
        criteria.setMaxResults(1);
        criteria.add(Restrictions.eq("status", CommonConstant.ACTIVE));
        return (TilesRight) criteria.uniqueResult();
    }

}
