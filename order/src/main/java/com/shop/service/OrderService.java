package com.shop.service;

import com.shop.model.Order;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface OrderService {
    /**
     * 订单生成
     * @return
     */
    public boolean createOrder(Order order, HttpServletRequest request);

    /**
     * 查询历史订单
     * @param id
     * @return
     */
    public List<Order> selectOrder(Long id);
}
