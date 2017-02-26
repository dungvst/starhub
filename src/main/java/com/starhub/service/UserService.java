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

    User updateUser(User user);

    User getDefaultUser();
}
