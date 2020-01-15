package com.shop.controller;

import com.shop.model.Order;
import com.shop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("/create")
    public boolean create(@RequestBody Order order,HttpServletRequest request){
        boolean order1 = orderService.createOrder(order, request);
        return order1;
    }

    /**
     * 查询所有订单
     * @param id
     * @return
     */
    @PostMapping("/select")
    public List<Order> selectOrser(@RequestBody Long id){
        List<Order> orders = orderService.selectOrder(id);
        System.out.println(orders.toString());
        return orders;
    }

}
