package com.lfj.demo.fallback;

import com.lfj.demo.model.User;
import com.lfj.demo.service.UserService;
import org.springframework.stereotype.Component;

/**
 * Created by lenovo on 2018/9/27.
 */
@Component
public class UserServiceFallback implements UserService{


    public User getUser() {
        User defaultUser = new User();
        defaultUser.setId("no found");
        defaultUser.setName("no user");
        return defaultUser;
    }
}
