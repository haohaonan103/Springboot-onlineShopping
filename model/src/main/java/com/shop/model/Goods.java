package com.shop.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * 商品表
 */
@Data
@Builder
@ToString
public class Goods {
    //goodsId 商品id
    private Long goodsId;
    // goodsName 商品名称
    private String goodsName;
    // goodsPrice  商品价格
    private Double goodsPrice;
    // goodsPic  商品图片url
    private String goodsPic;
    // goodsStatus
    private Integer goodsStatus;
    // goodsCount
    private int goodsCount;


}
