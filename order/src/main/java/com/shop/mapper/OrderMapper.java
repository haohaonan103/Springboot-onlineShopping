package com.shop.mapper;

import com.shop.model.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface OrderMapper {
    /**
     * 新增订单
     * @param order
     * @return
     */
    @Insert("insert into order(userId,goodsId,GoodsNum,orderTotal,orderTotalActual,orderTime) values(#{userId}," +
            "#{goodsId},#{GoodsNum},#{orderTotal},#{orderTotalActual},#{orderTime})")
    public boolean putOrder(Order order);



}
