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
    private Long userId;
    private String userName;
    private String userPassword;
}
