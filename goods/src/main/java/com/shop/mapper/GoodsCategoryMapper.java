package com.shop.mapper;

import com.shop.model.GoodsCategory;

public interface GoodsCategoryMapper {
    /**
     * 商品类别新增
     * @param goodsCategory
     * @return
     */
    public Integer putCategory(GoodsCategory goodsCategory);
}
