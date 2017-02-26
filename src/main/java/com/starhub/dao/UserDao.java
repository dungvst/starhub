/**
 * 
 */
package com.starhub.dao;

import com.starhub.model.User;

/**
 * @author DungNV
 *
 */
public interface UserDao {

    void updateUser(User user);

    User getDefaultUser();
}
