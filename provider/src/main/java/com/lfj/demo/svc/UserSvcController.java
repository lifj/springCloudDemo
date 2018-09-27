package com.lfj.demo.svc;

import com.lfj.demo.model.User;
import com.lfj.demo.service.UserService;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2018/9/27.
 */
@RestController
public class UserSvcController implements UserService{
    @Override
    public User getUser() {
        User user = new User();
        user.setId("id");
        user.setName("ant");
        return user;
    }


}
