package com.shop.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;


/**
 * user用户实体类
 */
@Data
@Builder
@ToString
public class User {
    //用户id
    private Long userId;
    //用户名
    private String userName;
    //用户密码
    private String userPassword;
}
