package com.shop.controller;

import com.shop.model.User;
import com.shop.service.LoginService;
import com.shop.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private LoginService loginService;
    @Autowired
    private SignService signService;

    /**
     * 登录方法
     * @param user
     * @return
     */
    @RequestMapping("/login")
    public boolean loginenter(@RequestBody User user,HttpServletRequest request){
        boolean loginselect = loginService.loginselect(user, request);
        return loginselect;
    }

    /**
     * 注册账号
     * @param user
     * @return
     */
    @RequestMapping("/sign")
    public boolean sign(@RequestBody User user){
        boolean b = signService.signSelect(user);
        return b;
    }

    @RequestMapping("/getCurrUser")
    User user(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        System.out.println("-------------当前用户 为 "+user+"-------------");
        return user;
    }
}
