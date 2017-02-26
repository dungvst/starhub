/**
 * 
 */
package com.starhub.service;

import com.starhub.model.User;

/**
 * @author DungNV
 *
 */
public interface UserService {

    void updateUser(User user);

    User getDefaultUser();
}
