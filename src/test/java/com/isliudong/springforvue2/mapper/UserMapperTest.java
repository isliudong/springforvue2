package com.isliudong.springforvue2.mapper;

import com.isliudong.springforvue2.Springforvue2Application;
import com.isliudong.springforvue2.model.User;
import com.isliudong.springforvue2.model.UserExample;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = Springforvue2Application.class)
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;


    @Test
    void selectByPrimaryKey() {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user.getId()+user.getName());
    }

    @Test
    void testSelectByExample() {
        UserExample userExample = new UserExample();

        List<User> users = userMapper.selectByExample(userExample);
        System.out.println(users);

    }
}