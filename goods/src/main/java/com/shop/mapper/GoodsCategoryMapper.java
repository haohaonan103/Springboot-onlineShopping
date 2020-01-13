package com.shop.mapper;

import com.shop.model.GoodsCategory;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GoodsCategoryMapper {
    /**
     * 商品类别新增
     * @param goodsCategory
     * @return
     */
    @Insert("insert into goods_category(categoryName) values(#{categoryName})")
    public Integer putCategory(GoodsCategory goodsCategory);

    /**
     * 删除类别
     * @param id
     * @return
     */
    @Delete("delete from goods_category where categoryId=#{id}")
    public Integer deleteCategory(String id);

    /**
     * 查询所有商品类别
     * @return
     */
    @Select("select * from goods_category")
    public List<GoodsCategory> selectCategory();
}
