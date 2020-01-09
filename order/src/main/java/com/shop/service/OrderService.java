package com.shop.service;

import com.shop.model.Order;

import javax.servlet.http.HttpServletRequest;

public interface OrderService {
    /**
     * 订单生成
     * @return
     */
    public boolean createOrder(Order order, HttpServletRequest request);
}
