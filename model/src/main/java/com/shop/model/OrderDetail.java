package com.shop.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * 订单明细实体类
 */
@Data
@Builder
@ToString
public class OrderDetail {
    //id  订单明细id
    private Long id;
    // orderId  订单id
    private Long orderId;
    // goodsId  商品id
    private Long goodsId;
}
