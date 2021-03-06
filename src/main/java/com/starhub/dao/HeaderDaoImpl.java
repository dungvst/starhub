/**
 * 
 */
package com.starhub.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.starhub.common.CommonConstant;
import com.starhub.model.HeaderSection;

/**
 * @author DungNV
 *
 */
@Repository("headerSectionDao")
public class HeaderDaoImpl extends AbstractDAO<Integer, HeaderSection> implements HeaderDao {

    @Override
    public void updateHeaderSection(HeaderSection headerSection) {
        update(headerSection);
    }

    @Override
    public HeaderSection getDefaultHeaderSection() {
        Criteria criteria = createEntityCriteria();
        criteria.setMaxResults(1);
        criteria.add(Restrictions.eq("status", CommonConstant.ACTIVE));
        return (HeaderSection) criteria.uniqueResult();
    }

}
