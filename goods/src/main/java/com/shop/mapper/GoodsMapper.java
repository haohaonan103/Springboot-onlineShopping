package com.shop.mapper;

import com.shop.model.Goods;
import com.shop.vo.GoodsVo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.security.Key;
import java.util.List;

@Mapper
@Repository
public interface GoodsMapper {

    /**
     * 查询所有商品信息
     * @return
     */
    @Select("SELECT * from goods g inner JOIN goods_category gc on g.goodsCateId=gc.categoryId")
    public List<GoodsVo> listAllGoods();

    /**
     * 查询类别下的所有商品
     * @param cateId 类别id
     * @return
     */
    @Select("SELECT * from goods g inner JOIN goods_category gc on " +
            "g.goodsCateId=gc.categoryId and g.goodsCateId=#{cateId}")
    public List<GoodsVo> listByCate(Long cateId);

    /**
     * 通过关键字模糊查询商品
     * @param key  关键字
     * @return
     */
    @Select("SELECT * from goods g inner JOIN goods_category gc " +
            "on g.goodsCateId=gc.categoryId and g.goodsName like  '%${key}%'")
    public List<GoodsVo> getLike(@Param(value = "key") String key);

    /**
     * 根据商品id查找商品
     * @param goodsId
     * @return
     */
    @Select("SELECT * from goods g inner JOIN goods_category gc " +
            "on g.goodsCateId=gc.categoryId and g.goodsId = #{id}")
    public GoodsVo getById(Long goodsId);

    /**
     * 修改商品库存
     * @param amount
     * @return
     */
    @Update("update goods set goodsCount=#{amount} where goodsId=#{goodsId}")
    public Integer updateGoods(int amount,Long goodsId);

    /**
     * 商品新增
     * @param goods
     * @return
     */
    @Insert("insert into goods(goodsName,goodsPrice,goodsPic,goodsStatus,goodsCateId,goodsCount) value(#{goodsName},#{goodsPrice},#{goodsPic},#{goodsStatus},#{goodsCateId},#{goodsCount})")
    public Integer putGoods(Goods goods);

    /**
     * 删除商品
     * @param id
     * @return
     */
    @Delete("delete from goods where id=#{id}")
    public Integer deleteGoods(Long id);
}
