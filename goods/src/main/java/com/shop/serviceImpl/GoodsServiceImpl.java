package com.shop.serviceImpl;




import com.shop.mapper.GoodsMapper;
import com.shop.model.Goods;

import com.shop.service.GoodsService;
import com.shop.util.FileUtils;
import com.shop.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;



    /**
     * 查询所有商品信息
     * @return
     */
    @Override
    public List<GoodsVo> listAllGoods() {
        List<GoodsVo> goodsVos = goodsMapper.listAllGoods();
        return goodsVos;
    }


    /**
     * 查询类别下的所有商品
     * @param cateId 类别id
     * @return
     */
    @Override
    public List<GoodsVo> listByCate(Long cateId) {
        List<GoodsVo> goodsVos = goodsMapper.listByCate(cateId);
        return goodsVos;
    }


    /**
     * 通过关键字模糊查询商品
     * @param key  关键字
     * @return
     */
    @Override
    public List<GoodsVo> getLike(String key) {
        List<GoodsVo> like = goodsMapper.getLike(key);
        return like;
    }


    /**
     * 根据商品id查找商品
     * @param goodsId
     * @return
     */
    @Override
    public GoodsVo getById(Long goodsId) {
        GoodsVo goodsVo = goodsMapper.getById(goodsId);
        return goodsVo;
    }

    /**
     * 商品新增
     * @param goods
     * @return
     */
    @Override
    @Transactional
    public boolean putGoods(Goods goods, MultipartFile file, HttpServletRequest request) {
        String newName = FileUtils.getNewName(file);
        goods.setGoodsPic(newName);
        boolean upload = FileUtils.upload(file, newName, request);
        Integer integer = goodsMapper.putGoods(goods);
        return integer==1;
    }

    /**
     * 商品删除
     * @param id
     * @return
     */
    @Override
    public Integer deleteGoods(Long id) {
        Integer integer = goodsMapper.deleteGoods(id);
        return integer;
    }
    @Override
    public List<GoodsVo> get4(){
        return this.getHolder();
    }
    private List<GoodsVo> getHolder(){
        List<GoodsVo> goodsVos = this.listAllGoods();
        List<GoodsVo> res = new ArrayList<>();
        int size = goodsVos.size();
        if(size<=4){
            return goodsVos;
        }else {
            res.add(goodsVos.get((size>>1)+1));
            res.add(goodsVos.get(size>>1));
            res.add(goodsVos.get((size>>1)-1));
            res.add(goodsVos.get((size>>1)+2));
        }
        return res;
    }
}
