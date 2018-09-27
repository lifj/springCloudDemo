package com.lfj.demo.service;

import com.lfj.demo.fallback.UserServiceFallback;
import com.lfj.demo.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by lenovo on 2018/9/27.
 */
@FeignClient(name = "provider", fallback = UserServiceFallback.class)
public interface UserService {

    @GetMapping("/svc/user/getUser")
    public User getUser();

}
