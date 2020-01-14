package com.shop.controller;

import com.shop.model.Goods;
import com.shop.service.GoodsService;
import com.shop.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/allByCate/{id}")
    public List<GoodsVo> getAllGoodsVoByCate(@PathVariable Long id){
        return goodsService.listByCate(id);
    }

    /**
     * 查询所有的商品
     * @return
     */
    @GetMapping(value ={"/allGoods","/like"})
    public List<GoodsVo> getAllGoodsVo(){
        return goodsService.listAllGoods();
    }

    /**
     * 根据id查询商品
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public GoodsVo getById(@PathVariable("id") Long id){
        return goodsService.getById(id);
        }

    /**
     * 商品新增
     * @param goods
     * @return
     */
    @RequestMapping("/insert")
    public boolean insertGoods(@RequestParam("goodsVo") GoodsVo goods, MultipartFile file, HttpServletRequest request){
        String goodsVo = request.getParameter("goodsVo");
        System.out.println(goodsVo);
         return goodsService.putGoods(goods,file,request);
     }

    /**
     * 商品删除
     * @param id
     * @return
     */
     @GetMapping("/delete")
     public Integer deleteGoods(Long id){
         Integer integer = goodsService.deleteGoods(id);
         return integer;
     }

    /**
     * 热卖推荐
     * @return
     */
     @GetMapping("/get4")
    List<GoodsVo> get4(){
         return goodsService.get4();
     };

     @RequestMapping("/like/{key}")
    List<GoodsVo> getLike(@PathVariable String  key){
         return goodsService.getLike(key);
     }
}
