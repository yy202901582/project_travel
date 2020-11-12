package com.my.travel.Service.api;

import com.my.travel.entity.User;

/**
 * Created by IntelliJ IDEA.
 * User: YANG
 * Date: 2020/11/12
 */
public interface UserService {

    void saveUser(User user);

    void removeUser(Integer userId);

    User getUserById(Integer userId);
}
