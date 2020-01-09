package com.shop.serviceImp;

import com.shop.mapper.CouponMapper;
import com.shop.mapper.GoodsMapper;
import com.shop.mapper.OrderMapper;
import com.shop.model.Coupon;
import com.shop.model.Order;
import com.shop.model.User;
import com.shop.service.GoodsService;
import com.shop.service.OrderService;
import com.shop.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class OrderServiceImp implements OrderService {
    //用来查询优惠券的折扣
    @Autowired
    private CouponMapper couponMapper;
    //用来拿商品库存
    @Autowired
    private GoodsMapper goodsMapper;
    //将ordermapper注入
    @Autowired
    private OrderMapper orderMapper;

    //订单金额
    private double count;
    //折后订单金额
    private double count2;

    /**
     * 添加到order
     * @param order
     * @return
     */
    @Override
    public boolean createOrder(Order order, HttpServletRequest request) {

        //先判断买的库存的数量是否大于购买数量
        GoodsVo byId = goodsMapper.getById(order.getGoodsId());
        if(byId.getGoodsCount()>order.getGoodsNum()){
            //优惠券折扣
            Coupon byId1 = couponMapper.getById(order.getCouponId());
            //总价
            count=(byId.getGoodsPrice())*Double.parseDouble(order.getGoodsNum().toString());
            //折后价格
            count2=(byId1.getCouponDiscount())*count;
            //获取当前时间
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String format = simpleDateFormat.format(date);
            HttpSession session = request.getSession();
            User user = (User)session.getAttribute("user");

            //给order对象赋值
            order.setUserId(user.getUserId());
            order.setOrderTotal(count);
            order.setOrderTotalActual(count2);
            order.setOrderTime(format);


            boolean b = orderMapper.putOrder(order);
            return true;
        }else {
            return false;
        }

    }
}
