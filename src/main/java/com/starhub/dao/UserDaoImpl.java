/**
 * 
 */
package com.starhub.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.starhub.common.CommonConstant;
import com.starhub.model.User;

/**
 * @author DungNV
 *
 */
@Repository("userDao")
public class UserDaoImpl extends AbstractDAO<Integer, User> implements UserDao {

    @Override
    public void updateUser(User user) {
        update(user);
    }

    @Override
    public User getDefaultUser() {
        Criteria criteria = createEntityCriteria();
        criteria.setMaxResults(1);
        criteria.add(Restrictions.eq("status", CommonConstant.ACTIVE));
        return (User) criteria.uniqueResult();
    }

}
