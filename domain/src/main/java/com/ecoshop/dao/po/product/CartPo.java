package com.ecoshop.dao.po.product;


import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

/**
 * 购物车表
 *
 * @TableName cart
 */
@Data
public class CartPo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 商品ID
     */
    private Long productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品图片
     */
    private String productImage;

    /**
     * SKU ID
     */
    private Long skuId;

    /**
     * SKU编码
     */
    private String skuCode;

    /**
     * SKU规格(JSON格式)
     */
    private String skuSpec;

    /**
     * 商品单价
     */
    private BigDecimal price;

    /**
     * 购买数量
     */
    private Integer quantity;

    /**
     * 是否选中(1:是,0:否)
     */
    private Integer checked;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 修改时间
     */
    private Date updatedAt;

    
}