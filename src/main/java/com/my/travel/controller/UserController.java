package com.my.travel.controller;

import com.my.travel.Service.api.UserService;
import com.my.travel.entity.User;
import com.my.travel.mapper.UserMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取用户id", notes = "获取用户id")
    @GetMapping("/get/user/{id}")
    public User getUserId(@PathVariable("id") Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }


}
