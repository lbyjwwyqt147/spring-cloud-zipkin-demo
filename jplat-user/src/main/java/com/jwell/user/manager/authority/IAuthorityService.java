package com.jwell.user.manager.authority;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(value = "security-service",fallback = AuthorityHystric.class)
@Component
public interface IAuthorityService {

    //@GetMapping("/security/api/through")
    Boolean isPass(@RequestParam(value = "token") String token, @RequestParam(value = "url") String url);

}
