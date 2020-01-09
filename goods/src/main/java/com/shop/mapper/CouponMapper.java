package com.shop.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CouponMapper {
    @Insert("insert into user_coupon set userId = #{userId} , couponId = #{couponId}")
    public Integer getCoupon(Long userId,Long couponId);
}
