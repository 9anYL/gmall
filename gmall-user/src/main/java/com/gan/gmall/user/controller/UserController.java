package com.gan.gmall.user.controller;

import com.gan.gmall.user.bean.UmsUser;
import com.gan.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsUser> getAllUser() {
        return userService.getAllUser();
    }

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "hello world";
    }
}
