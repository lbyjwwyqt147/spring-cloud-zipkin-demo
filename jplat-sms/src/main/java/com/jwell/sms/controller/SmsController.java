package com.jwell.sms.controller;

import com.alibaba.fastjson.JSON;
import com.jwell.entity.User;
import com.jwell.sms.manager.user.IUserService;
import com.jwell.sms.service.ISmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class SmsController {

    @Autowired
    private ISmsService smsService;
    @Autowired
    private IUserService userService;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient client;

    @GetMapping("/sms/api/sendMsg")
    public String sendMsg(@RequestParam String name, @RequestParam String msg){
        return smsService.sendMessage(name,msg);
    }

    @GetMapping("/sms/api/userName")
    public String userName(){
        return userService.userNmae("俏如来");
    }

    @GetMapping("/sms/api/userName/r")
    public String getUserName(){
        //ServiceInstance instance = client.choose("user-service");
        String url = "http://user-service/user/api/name?name=魔如来";
        String name = restTemplate.getForObject(url,String.class);
        return name;
    }

    @GetMapping("/sms/api/getUser")
    public User getUser(){
        User user = new User();
        user.setSex((byte)5);
        user.setUserId("100");
        user.setName("孤鸿");
        return userService.getUser(JSON.toJSONString(user),(byte)4);
    }

    @PutMapping("/sms/api/user/status")
    String putUserStatus(@RequestParam(value = "id") String id,@RequestParam(value = "status") Byte status){
        return userService.putUserStatus(id,status);
    }

    @DeleteMapping("/sms/api/user/del")
    String delUser(@RequestParam(value = "id") String id){
        return userService.delUser(id);
    }


}
