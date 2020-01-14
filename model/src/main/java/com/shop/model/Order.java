package com.shop.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * 订单实体类
 */
@Data
@ToString
public class Order {
    //orderId
    private Long orderId;
    // userId
    private Long userId;
    //商品id
    private Long goodsId;
    //商品数量
    public Long GoodsNum;
    //优惠券id
    private Long couponId;
    // orderTotal--总金额
    private Double orderTotal;
    // orderTotalActual--实际总金额
    private Double orderTotalActual;
    // orderTime--购买时间
    private String orderTime;
}
