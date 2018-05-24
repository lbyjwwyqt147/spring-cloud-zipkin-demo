package com.jwell.user.manager.authority;

import org.springframework.stereotype.Component;

@Component
public class AuthorityHystric implements IAuthorityService {
    @Override
    public Boolean isPass(String token, String url) {
        return false;
    }
}
