package com.shop.controller;

import com.shop.service.GoodsService;
import com.shop.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    /**
     * 查询所有的商品
     * @return
     */
    @GetMapping("/allGoods")
    public List<GoodsVo> getAllGoodsVo(){
        return goodsService.listAllGoods();
    }

    /**
     * 根据id查询商品
     * @param id
     * @return
     */
    @GetMapping("/{id}")
        public GoodsVo getById(@PathVariable Long id){
        return goodsService.getById(id);
        }
}
