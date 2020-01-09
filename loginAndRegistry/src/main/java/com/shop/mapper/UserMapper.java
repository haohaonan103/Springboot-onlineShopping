package com.shop.mapper;

import com.shop.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UserMapper {
    /**
     * 登录校验查询user
     * @return
     */
    @Select("select * from user where userName=#{userName} and userPassword=#{userPassword}")
    public User loginselect(User user);
    @Select("select * from user where userId = #{userId}")
    User getById(Long userId);
}
