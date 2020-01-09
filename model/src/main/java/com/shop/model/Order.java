package com.shop.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * 订单实体类
 */
@Data
@Builder
@ToString
public class Order {
    //orderId
    private Long orderId;
    // userId
    private Long userId;
    // orderTotal--总金额
    private Double orderTotal;
    // orderTotalActual--实际总金额
    private Double orderTotalActual;
    // orderTime--购买时间
    private Date orderTime;
}
