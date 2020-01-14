package com.shop.controller;

import com.shop.model.GoodsCategory;
import com.shop.service.GoodsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goodscategory")
public class GoodsCategoryController {
    @Autowired
    private GoodsCategoryService goodsCategoryService;

    /**
     * 新增商品类别
     * @param goodsCategory
     * @return
     */
    @GetMapping("/insert")
    public Integer insertCategory(GoodsCategory goodsCategory){
        Integer integer = goodsCategoryService.putCategory(goodsCategory);
        return integer;
    }
    /**
     * 删除商品类别
     * @param id
     * @return
     */
    @GetMapping("/delete")
    public Integer deleteCategory(String id){
        Integer integer = goodsCategoryService.deleteCategory(id);
        return integer;
    }

    /**
     * 修改商品类别
     * @param goodsCategory
     * @return
     */
    @GetMapping("/update")
    public Integer updateCategory(GoodsCategory goodsCategory){
        Integer integer = goodsCategoryService.updeteCategory(goodsCategory);
        return integer;
    }

    /**
     * 查询所有类别
     * @return
     */
    @GetMapping("/select")
    public List<GoodsCategory> selectCategory(){
        List<GoodsCategory> goodsCategories = goodsCategoryService.selectCategory();
        return goodsCategories;
    }
}
