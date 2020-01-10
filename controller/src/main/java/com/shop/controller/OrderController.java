package com.shop.controller;

import com.shop.model.Order;
import com.shop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/order")
public class OrderController {
    private HttpServletRequest request;
    @Autowired
    private OrderService orderService;
    @GetMapping("/create")
    public boolean create(Order order){
        boolean order1 = orderService.createOrder(order, request);
        return order1;
    }
}
