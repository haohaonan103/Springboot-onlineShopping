package com.shop.serviceImpl;

import com.shop.mapper.GoodsCategoryMapper;
import com.shop.model.GoodsCategory;
import com.shop.service.GoodsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsCategoryServiceImp implements GoodsCategoryService {
    @Autowired
    private GoodsCategoryMapper goodsCategoryMapper;


    /**
     * 商品类别新增
     * @param goodsCategory
     * @return
     */
    @Override
    public Integer putCategory(GoodsCategory goodsCategory) {
        Integer integer = goodsCategoryMapper.putCategory(goodsCategory);
        return integer;
    }

    /**
     * 类别的修改
     * @param id
     * @return
     */
    @Override
    public Integer deleteCategory(String id) {
        Integer integer = goodsCategoryMapper.deleteCategory(id);
        return integer;
    }

    /**
     * 商品类别修改
     * @param goodsCategory
     * @return
     */
    @Override
    public Integer updeteCategory(GoodsCategory goodsCategory) {
        Integer integer = goodsCategoryMapper.deleteCategory(goodsCategory.getCategoryId().toString());
        Integer integer1 = goodsCategoryMapper.putCategory(goodsCategory);
        return integer1;
    }

    @Override
    public List<GoodsCategory> selectCategory() {
        List<GoodsCategory> goodsCategories = goodsCategoryMapper.selectCategory();
        return goodsCategories;
    }
}
