package com.shop.serviceImp;

import com.shop.mapper.SignMapper;
import com.shop.model.User;
import com.shop.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SignServiceImp implements SignService {
    @Autowired
    private SignMapper signMapper;
    @Override
    public boolean signSelect(User user) {
        List<User> users = signMapper.signSelect(user);
        if(users.size()>0){
            return false;
        }else {
            putuser(user);
            return true;
        }
    }

    @Override
    public Integer putuser(User user) {
        Integer putuser = signMapper.putuser(user);
        return null;
    }
}
