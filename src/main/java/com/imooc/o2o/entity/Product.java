package com.imooc.o2o.entity;

import java.util.Date;
import java.util.List;

public class Product {
    //商品id
    private Long productId;
    //商品名
    private String productName;
    //商品描述
    private String productDesc;
    //简略图
    private String imgAddr;
    //原价
    private String normalPrice;
    //折扣价
    private String promotionPrice;
    //权重
    private Integer priority;
    //创建时间
    private Date createTime;
    //修改时间
    private Date lastEditTime;
    //状态 -1不可用 0下架 1在前端展示系统展示
    private Integer enableStatus;

    //商品图片列表
    private List<ProductImg> productImgList;
    //商品种类
    private ProductCategory productCategory;
    //店铺
    private Shop shop;
}
