package com.shop.controller;

import com.shop.service.GoodsService;
import com.shop.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping("/allGoods")
    public List<GoodsVo> getAllGoods(){
        return goodsService.listAllGoods();
    }

}
