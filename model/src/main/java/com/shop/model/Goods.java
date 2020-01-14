package com.shop.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 商品实体类
 */

@ToString
@NoArgsConstructor
@Accessors(chain = true)
public class Goods {
    //goodsId 商品id
    private Long goodsId;
    // goodsName 商品名称
    private String goodsName;
    // goodsPrice  商品价格
    private Double goodsPrice;
    // goodsPic  商品图片url
    private String goodsPic;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsPic() {
        return goodsPic;
    }

    public void setGoodsPic(String goodsPic) {
        this.goodsPic =goodsPic;
    }

    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public int getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(int goodsCount) {
        this.goodsCount = goodsCount;
    }

    public Long getGoodsCateId() {
        return goodsCateId;
    }

    public void setGoodsCateId(Long goodsCateId) {
        this.goodsCateId = goodsCateId;
    }

    // goodsStatus 商品状态
    private Integer goodsStatus;
    // goodsCount 商品库存
    private int goodsCount;
    private Long goodsCateId;


}
