package com.shop.mapper;

import com.shop.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 注册查重
 */
@Mapper
@Repository
public interface SignMapper {
    /**
     * 注册查重mapper方法
     * @return
     */
    @Select("select * from user where userName = #{userName}")
    public List<User> signSelect(User user);

    /**
     * 添加user新用户
     * @param user
     * @return
     */
    @Insert("insert into user(userName,userPassword) values(#{userName},#{userPassword})")
    public Integer putuser(User user);
 }
