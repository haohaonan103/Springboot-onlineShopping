package com.shop.mapper;

import com.shop.model.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
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
    @Insert("insert into `order` (couponId,userId,goodsId,GoodsNum,orderTotal,orderTotalActual,orderTime) values (#{couponId},#{userId}," +
            "#{goodsId},#{GoodsNum},#{orderTotal},#{orderTotalActual},#{orderTime})")
    public boolean putOrder(Order order);

    /**
     * 查询历史订单
     * @param id
     * @return
     */
    @Select("select o.*,g.goodsName FROM `order` o INNER JOIN goods g on o.goodsId=g.goodsId where o.userId=333")
    public List<Order> selectOrder(Long id);


}
