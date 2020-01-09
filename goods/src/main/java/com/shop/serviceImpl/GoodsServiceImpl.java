package com.shop.serviceImpl;

import com.shop.mapper.CouponMapper;
import com.shop.mapper.GoodsMapper;
import com.shop.model.Goods;
import com.shop.model.User;
import com.shop.service.GoodsService;
import com.shop.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private CouponMapper couponMapper;

    /**
     * 领取优惠券
     * @param user 用户对象
     * @param couponId  优惠券id
     * @return true/false
     */
    @Override
    @Transactional
    public boolean getCoupon(User user, Long couponId) {
        Integer coupon = couponMapper.getCoupon(user.getUserId(), couponId);
        if(coupon<0){
            System.out.println("领取失败");
            return false;
        }
        return true;

    }


    /**
     * 查询所有商品信息
     * @return
     */
    @Override
    public List<GoodsVo> listAllGoods() {
        List<GoodsVo> goodsVos = goodsMapper.listAllGoods();
        return goodsVos;
    }


    /**
     * 查询类别下的所有商品
     * @param cateId 类别id
     * @return
     */
    @Override
    public List<GoodsVo> listByCate(Long cateId) {
        List<GoodsVo> goodsVos = goodsMapper.listByCate(cateId);
        return goodsVos;
    }


    /**
     * 通过关键字模糊查询商品
     * @param key  关键字
     * @return
     */
    @Override
    public List<GoodsVo> getLike(String key) {
        List<GoodsVo> like = goodsMapper.getLike(key);
        return null;
    }


    /**
     * 根据商品id查找商品
     * @param goodsId
     * @return
     */
    @Override
    public GoodsVo getById(Long goodsId) {
        GoodsVo goodsVo = goodsMapper.getById(goodsId);
        return goodsVo;
    }
}
