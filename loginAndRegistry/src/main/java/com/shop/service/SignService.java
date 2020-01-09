package com.shop.service;

import com.shop.model.User;

import java.util.List;

/**
 * 注册查重类
 */
public interface SignService {
    /**
     * 注册查重方法
     * @return
     */
    public boolean signSelect(User user);
    /**
     * 添加user新用户
     * @param user
     * @return
     */
    public Integer putuser(User user);
}
