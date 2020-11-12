package com.my.travel.mapper;

import com.my.travel.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User selectByPrimaryKey(Integer id);

    int insert(User record);

    int delectByPrimaryKey(Integer id);

}