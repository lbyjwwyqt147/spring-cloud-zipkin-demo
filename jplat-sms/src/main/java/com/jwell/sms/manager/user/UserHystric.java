package com.jwell.sms.manager.user;

import com.jwell.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class UserHystric implements IUserService {


    @Override
    public String userNmae(@RequestParam(value = "name") String name) {
        return "获取用户名称出现网络错误";
    }

    @Override
    public User getUserInfo(String userId) {
        return new User();
    }

    @Override
    public User getUser(String user,Byte sex) {
        return new User();
    }

    @Override
    public String putUserStatus(String id, Byte status) {
        return "修改用户状态调用出错";
    }

    @Override
    public String delUser(String id) {
        return "删除用户信息调用出错";
    }


}
