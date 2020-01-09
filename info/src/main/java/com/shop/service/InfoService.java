package com.shop.service;

public interface InfoService {
    /**
     * 修改密码
     * @return
     */
    boolean changePwd(Long userId,String newPwd);
}
