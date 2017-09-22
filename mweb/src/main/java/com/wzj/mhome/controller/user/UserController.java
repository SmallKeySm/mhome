package com.wzj.mhome.controller.user;

import com.wzj.model.user.User;
import com.wzj.spi.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserService<User, Long> userService;

    @RequestMapping(name = "保存用户", value = "/save")
    @ResponseBody
    public User save() {
        User user = new User();
        user.setName("Jerry");
        user.setEmail("itcrazyjun@163.com");
        return userService.save(user);
    }

    @RequestMapping(name = "列出所有用户", value = "/list")
    @ResponseBody
    public List<User> find() {
        return userService.findAll();
    }
}
