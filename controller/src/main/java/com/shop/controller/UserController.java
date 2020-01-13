package com.shop.controller;

import com.shop.model.User;
import com.shop.service.LoginService;
import com.shop.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {
    private HttpServletRequest request;
    @Autowired
    private LoginService loginService;
    @Autowired
    private SignService signService;

    /**
     * 登录方法
     * @param user
     * @return
     */
    @PostMapping("/login")
    public boolean loginenter(User user){
        boolean loginselect = loginService.loginselect(user, request);
        return loginselect;
    }

    /**
     * 注册账号
     * @param user
     * @return
     */
    @GetMapping("/sign")
    public boolean sign(User user){
        boolean b = signService.signSelect(user);
        return b;
    }
}
