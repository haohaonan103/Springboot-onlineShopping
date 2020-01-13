package com.shop.service;

import com.shop.model.Goods;
import com.shop.model.User;
import com.shop.vo.GoodsVo;

import java.util.List;

/**
 * 商品页面接口
 */
public interface GoodsService {
    /**
     * 领取优惠券
     * @param user 用户对象
     * @param couponId  优惠券id
     * @return true/false
     */
    public boolean getCoupon(User user,Long couponId);

    /**
     * 查询所有商品信息
     * @return
     */
    public List<GoodsVo> listAllGoods();

    /**
     * 查询类别下的所有商品
     * @param cateId 类别id
     * @return
     */
    public List<GoodsVo> listByCate(Long cateId);

    /**
     * 通过关键字模糊查询商品
     * @param key  关键字
     * @return
     */
    public List<GoodsVo> getLike(String key);

    /**
     * 根据商品id查找商品
     * @param goodsId
     * @return
     */
    public GoodsVo getById(Long goodsId);
    /**
     * 商品新增
     * @param goods
     * @return
     */
    public Integer putGoods(Goods goods);

    /**
     * 商品删除
     * @param id
     * @return
     */
    public Integer deleteGoods(Long id);
}
