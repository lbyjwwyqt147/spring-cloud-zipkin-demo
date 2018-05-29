package com.jwell.user.controller;

import com.alibaba.fastjson.JSON;
import com.jwell.entity.User;
import com.jwell.user.manager.authority.IAuthorityService;
import com.jwell.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private IUserService userService;
    /*@Autowired
    private IAuthorityService authorityService;*/

    @GetMapping("/api/name")
    public String userName(@RequestParam String name){
       // authorityService.isPass("1","baidu");
        return userService.userNmae(name);
    }
    @GetMapping("/api/user")
    public User getUser(@RequestParam(value = "userId")String userId){
        return userService.getUserInfo(userId);
    }

    @RequestMapping(value = "api/user/save",method = RequestMethod.POST)
    public User getUserInfo(@RequestBody  String params,@RequestParam(value = "sex") Byte sex){
        System.out.println("进入保存用户方法  参数："+params);
        System.out.println("进入保存用户方法  sex参数："+sex);
        User user1 = JSON.parseObject(params,User.class);
        return userService.getUser(user1);
    }
}
