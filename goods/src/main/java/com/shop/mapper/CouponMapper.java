package com.shop.mapper;

import com.shop.model.Coupon;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CouponMapper {
    @Insert("insert into user_coupon set userId = #{userId} , couponId = #{couponId}")
    public Integer getCoupon(@Param(value = "userId") Long userId,@Param(value = "couponId") Long couponId);

    @Select("select * from coupon where couponId = #{couponId}")
    Coupon getById(Long couponId);

    @Select("select * from user_coupon uc left join coupon c on uc.userId = #{userId}")
    List<Coupon> getByUserId(Long userId);

    @Select("select * from coupon")
    List<Coupon> getAll();
}
