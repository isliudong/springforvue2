package com.isliudong.springforvue2.controller;

import com.isliudong.springforvue2.dto.PageDTO;
import com.isliudong.springforvue2.mapper.UserMapper;
import com.isliudong.springforvue2.model.User;
import com.isliudong.springforvue2.model.UserExample;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: springforvue2
 * @description:
 * @author: 闲乘月
 * @create: 2020-07-08 21:12
 **/
@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    UserMapper userMapper;
    @GetMapping("/getPage")
    PageDTO<User> getPage(@RequestParam(name = "page", defaultValue = "1") Integer page, @RequestParam(name = "size", defaultValue = "6") Integer size){
        int offset = size*(page-1);
        List<User> userList = userMapper.selectByExampleWithRowbounds(new UserExample(), new RowBounds(offset, size));
        long total = userMapper.countByExample(new UserExample());
        PageDTO<User> pageDTO = new PageDTO<User>(userList, page, (int) total, size);
        return pageDTO;
    }

    @PostMapping("/createUser")
    public String createUser(@RequestBody User user){
        int insert = userMapper.insert(user);
        if(insert==1)
        return "success";
        else return "error";
    }

    @PostMapping("/updateUser")/*应该使用putmapping但是存在跨域问题（鄙人未解决）*/
    public String updateUser(@RequestBody User user){
        int i = userMapper.updateByPrimaryKey(user);
        if(i==1)
        return "success";
        else return "error";
    }

    @GetMapping("/deleteUser")
    public String deleteUser(Integer id){
        int i = userMapper.deleteByPrimaryKey(id);
        if(i==1)
            return "success";
        else return "error";
    }
}
