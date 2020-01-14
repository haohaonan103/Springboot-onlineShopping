package com.shop.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * 优惠券实体类
 */
@Data
@ToString
public class Coupon {
    //couponId  优惠券id
    private Long couponId;
    // couponName  优惠券名称
    private String couponName;
    // couponDiscount  折扣
    private Double couponDiscount;
}
