package com.jwell.sms.controller;

import com.alibaba.fastjson.JSON;
import com.jwell.entity.User;
import com.jwell.sms.manager.user.IUserService;
import com.jwell.sms.service.ISmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
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

    @GetMapping("/sms/api/msg")
    public String sendMsg(@RequestParam String name, @RequestParam String msg){
        System.out.println(userService.userNmae(name));
      /*  User user = userService.getUserInfo("1");
        System.out.println(user);
        System.out.println(user.getName());


        User user1 = userService.getUserInfo("2");
        userService.getUser(JSON.toJSONString(user1),(byte)3);
*/
        return smsService.sendMessage(name,msg);
    }

    @GetMapping("/sms/api/userName")
    public String userName(){
        return userService.userNmae("俏如来");
    }

    @GetMapping("/sms/api/userName/1")
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

}
