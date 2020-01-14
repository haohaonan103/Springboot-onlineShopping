package com.shop.controller;

import com.shop.model.Coupon;
import com.shop.model.User;
import com.shop.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/coupon")
public class CouponController {
    @Autowired
    private CouponService service;

    /**
     * 领取优惠券
     * @param request
     * @param coupon
     * @return
     */
    @RequestMapping("/get")
    public boolean getCoupon(HttpServletRequest request, @RequestBody Coupon coupon){
        User user = (User) request.getSession().getAttribute("user");
        if(user==null){
            System.out.println("-----领券失败，请先登录------");
            return false;
        }
        return service.getCoupon(user,coupon.getCouponId());
    }

    @GetMapping("/all")
    public List<Coupon> all(){
        return service.selectAll();
    }
    @RequestMapping("/getByUser")
    List<Coupon> getByUser(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        return service.selectAllByUser(user.getUserId());
    }

    @RequestMapping("/getById")
    Coupon getById(Coupon coupon){
        return service.getById(coupon.getCouponId());
    }

}
