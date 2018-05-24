package com.jwell.user.service.impl;

import com.jwell.entity.User;
import com.jwell.user.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Override
    public String userNmae(String name) {
        System.out.println("调用user 服务的　userName()");
        return "hello：" + name;
    }

    @Override
    public User getUserInfo(String userId) {
        User user = new User();
        if(userId.equals("1")){
            user.setName("张三");
        }else if (userId.equals("2")){
            user.setName("李四");
        }else {
            user.setName("王五");
        }
        user.setUserId(userId);
        user.setSex((byte)1);
        return user;
    }

    @Override
    public User getUser(User user) {
        System.out.println("保存用户 userNmae: "+user.getName());
        return user;
    }
}
