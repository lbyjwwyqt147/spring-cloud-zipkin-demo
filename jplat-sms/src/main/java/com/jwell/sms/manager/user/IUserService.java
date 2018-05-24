package com.jwell.sms.manager.user;

import com.jwell.entity.User;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user-service",fallback = UserHystric.class)
public interface IUserService {

    /**
     * get请求 参数上必须写 @RequestParam(value = "name")  不然会被feign当做POST
     * @param name
     * @return
     */
    @GetMapping("/user/api/name")
    String userNmae(@RequestParam(value = "name") String name);

    @GetMapping("/user/api/user")
    User getUserInfo(@RequestParam(value = "userId") String userId);

    @PostMapping("/user/api/user/save")
     User getUser (@RequestBody String user,@RequestParam(value = "sex") Byte sex);
}
