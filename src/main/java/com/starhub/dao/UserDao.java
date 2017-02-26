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

    User updateUser(User user);

    User getDefaultUser();
}
