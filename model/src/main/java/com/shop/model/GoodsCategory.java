package com.shop.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * 商品类别实体类
 */
@Data
@ToString
public class GoodsCategory {
    //categoryId
    private Long categoryId;
    // categoryName
    private String categoryName;
}
