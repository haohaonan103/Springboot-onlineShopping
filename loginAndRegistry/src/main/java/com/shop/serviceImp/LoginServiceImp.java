package com.shop.serviceImp;

import com.shop.mapper.UserMapper;
import com.shop.model.User;
import com.shop.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
@Service
public class LoginServiceImp implements LoginService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean loginselect(User user, HttpServletRequest request) {
        User loginselect = userMapper.loginselect(user);
        if(loginselect!=null){
            HttpSession session = request.getSession();
            session.setAttribute("user",loginselect);
            return true;
        }else {
            return false;
        }
    }
}
