package com.shop.mapper;

import com.shop.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UserMapper {
    /**
     * 登录校验查询user
     * @return
     */
    @Select("select * from user where userName=#{userName} and userPasswore=#{userPassword}")
    public User loginselect(User user);
    @Select("select * from user where userId = #{userId}")
    User getById(Long userId);
    @Update("update user set userPassword = #{newPwd} where userId = #{userId}")
    Integer changePwd(@Param(value = "userId") Long userId,@Param("newPwd") String newPwd);
}
