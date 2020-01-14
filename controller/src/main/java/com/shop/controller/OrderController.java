package com.shop.controller;

import com.shop.model.Order;
import com.shop.model.User;
import com.shop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private HttpServletRequest request;
    @Autowired
    private OrderService orderService;

    /**
     * 新增商品
     * @param order
     * @return
     */
    @GetMapping("/create")
    public boolean create(Order order){
        boolean order1 = orderService.createOrder(order, request);
        return order1;
    }

    /**
     * 查询所有订单
     * @param
     * @return
     */
    @PostMapping("/select")
    public List<Order> selectOrder(@RequestBody String id){
        System.out.println(id.length());
        String id1=id.substring(0,id.length()-1);
        List<Order> orders = orderService.selectOrder(Long.valueOf(id1));
        return orders;
    }


}
