package com.shop.service;

import com.shop.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface LoginService {
    /**
     * 登录校验查询user
     * @return
     */
    public boolean loginselect(User user, HttpServletRequest request);
}
