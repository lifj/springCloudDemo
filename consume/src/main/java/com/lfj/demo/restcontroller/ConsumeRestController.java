package com.lfj.demo.restcontroller;

import com.lfj.demo.model.User;
import com.lfj.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2018/9/27.
 */
@RestController
public class ConsumeRestController {

    @Autowired
    private UserService userService;

    @GetMapping("/api/user/get")
    public User getUser(){
        User user = userService.getUser();
        return user;
    }

}
