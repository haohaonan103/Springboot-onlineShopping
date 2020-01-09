package com.shop.vo;

import com.shop.model.Goods;
import lombok.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GoodsVo extends Goods {
    //categoryId 类别id
    private Long categoryId;
    // categoryName  类别名称
    private String categoryName;
}
