package com.shop.controller;

import com.shop.model.User;
import com.shop.service.GoodsService;
import com.shop.service.InfoService;
import com.shop.service.LoginService;
import com.shop.service.SignService;
import com.shop.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private LoginService loginService;
    @Autowired
    private SignService signService;
    @Autowired
    private InfoService infoService;

    @GetMapping("/allGoods")
    public Object getAllGoods(HttpServletRequest request){

        return null;
    }
    @GetMapping("/{id}")
    public GoodsVo getById(@PathVariable Long id){
        return goodsService.getById(id);
    }

}
