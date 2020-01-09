package com.shop.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * 商品类别表
 */
@Data
@Builder
@ToString
public class GoodsCategory {
    //categoryId
    private Long categoryId;
    // categoryName
    private String categoryName;
}
