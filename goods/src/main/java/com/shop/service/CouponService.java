package com.shop.service;

import com.shop.model.Coupon;
import com.shop.model.User;

import javax.validation.constraints.Max;
import java.util.List;

public interface CouponService {
    /**
     * 领取优惠券
     * @param user 用户对象
     * @param couponId  优惠券id
     * @return true/false
     */
    public boolean getCoupon(User user, Long couponId);

    /**
     * 查询用户的优惠券
     * @return
     */
    List<Coupon> selectAllByUser(Long userId);

    /**
     * 查询所有的优惠券
     * @return
     */
    List<Coupon> selectAll();

    /**
     * 根据优惠券id查询优惠券
     * @param couponId
     * @return
     */
    Coupon getById(Long couponId);
}
