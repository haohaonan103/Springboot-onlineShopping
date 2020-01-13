package com.shop.service;

import com.shop.model.GoodsCategory;

import java.util.List;

public interface GoodsCategoryService {
    /**
     * 商品类别新增
     * @param goodsCategory
     * @return
     */
    public Integer putCategory(GoodsCategory goodsCategory);

    /**
     * 删除类别
     * @param id
     * @return
     */
    public Integer deleteCategory(String id);

    /**
     * 修改商品类别
     * @param goodsCategory
     * @return
     */
    public Integer updeteCategory(GoodsCategory goodsCategory);

    /**
     * 查询所有类别
     * @return
     */
    public List<GoodsCategory> selectCategory();
}
