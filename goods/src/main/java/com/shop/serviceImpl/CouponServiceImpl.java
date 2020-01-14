package com.shop.serviceImpl;

import com.shop.mapper.CouponMapper;
import com.shop.model.Coupon;
import com.shop.model.User;
import com.shop.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CouponServiceImpl implements CouponService {
    @Autowired
    private CouponMapper mapper;
    @Override
    @Transactional
    public boolean getCoupon(User user, Long couponId) {
        return mapper.getCoupon(user.getUserId(),couponId)==1;
    }

    @Override
    public List<Coupon> selectAllByUser(Long userId) {
        return mapper.getByUserId(userId);
    }

    @Override
    public List<Coupon> selectAll() {
        return mapper.getAll();
    }

    @Override
    public Coupon getById(Long couponId) {
        return mapper.getById(couponId);
    }
}
