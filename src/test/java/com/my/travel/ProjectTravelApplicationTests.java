package com.my.travel;

import com.my.travel.Service.api.UserService;
import com.my.travel.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Date;

@SpringBootTest
class ProjectTravelApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() throws SQLException {

        System.out.println(dataSource.getClass());

        Connection connection = dataSource.getConnection();

        connection.close();
    }

    @Test
    public void testSelectUserId() {
        int userId = 299;
        String result = userService.getUserById(userId).toString();
        System.out.println(result);
    }

    @Test
    public void testInsertUser() {
        User user = new User(null
                , "code"
                , "account" + "100000"
                , "0"                // 账号显示是否加密状态（0：否，1：是
                , "password"
                , "name"
                , "nickname"
                , "headPortrait"
                , "phone"
                , "secondPhone"
                , "email"
                , "0"                      // 状态 0-已禁用 1-已启用
                , 0                 // 平台渠道\r\n1、应急平台
                , "merchantNumber"
                , "supplierNumber"
                , "createBy"
                , new Date()
                , "updateBy"
                , new Date()
                , "data1"
                , "data2"
                , "data3"
                , "delFlag"
                , "1"                 // 性别（1-男 2-女）
                , "cardNumber"
                , "unit"
                , 0
                , "post"
                , "department"
                , 0
                , "description"
                , 0
                , "second_Id"
                , 0
                , 0
                , 0
                , 0
                , "18"
                , "birthday"
                , "0"                 // 融合通信平台是否授权（0-未授权 1-授权）
        );

        userService.saveUser(user);
    }



}
