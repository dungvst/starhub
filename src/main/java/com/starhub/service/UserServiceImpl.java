/**
 * 
 */
package com.starhub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.starhub.dao.UserDao;
import com.starhub.model.User;

/**
 * @author DungNV
 *
 */
@Repository("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User updateUser(User user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User getDefaultUser() {
        return userDao.getDefaultUser();
    }

}
