package com.shop.vo;

import com.shop.model.Goods;
import lombok.*;
import lombok.experimental.Accessors;

import javax.jws.HandlerChain;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class GoodsVo extends Goods {
    //categoryId 类别id
    private Long categoryId;
    // categoryName  类别名称
    private String categoryName;
}
