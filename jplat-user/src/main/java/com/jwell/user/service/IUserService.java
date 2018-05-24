package com.jwell.user.service;

import com.jwell.entity.User;

public interface IUserService {

    String userNmae(String name);

    User getUserInfo(String userId);

    User getUser(User user);

}
