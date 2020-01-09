package com.shop.serviceImpl;

import com.shop.mapper.UserMapper;
import com.shop.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoServiceImpl implements InfoService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean changePwd(Long userId,String newPwd) {
        Integer res = userMapper.changePwd(userId,newPwd);
        if(res>0){
            return true;
        }
        return false;
    }
}
