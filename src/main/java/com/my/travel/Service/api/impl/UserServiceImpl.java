package com.my.travel.Service.api.impl;

import com.my.travel.Service.api.UserService;
import com.my.travel.entity.User;
import com.my.travel.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: YANG
 * Date: 2020/11/12
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void saveUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void removeUser(Integer userId) {
        userMapper.delectByPrimaryKey(userId);
    }

    @Override
    public User getUserById(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
