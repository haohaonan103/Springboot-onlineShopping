package com.shop.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 商品实体类
 */
@Data
@Builder
@ToString
@NoArgsConstructor
public class Goods {
    //goodsId 商品id
    private Long goodsId;
    // goodsName 商品名称
    private String goodsName;
    // goodsPrice  商品价格
    private Double goodsPrice;
    // goodsPic  商品图片url
    private String goodsPic;
    // goodsStatus 商品状态
    private Integer goodsStatus;
    // goodsCount 商品库存
    private int goodsCount;


}
