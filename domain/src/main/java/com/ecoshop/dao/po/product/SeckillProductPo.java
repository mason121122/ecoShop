package com.ecoshop.dao.po.product;


import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 秒杀商品表
 * @TableName seckill_product
 */
@Data
public class SeckillProductPo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 秒杀活动ID
     */
    private Long activityId;

    /**
     * 商品ID
     */
    private Long productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * SKU ID
     */
    private Long skuId;

    /**
     * SKU编码
     */
    private String skuCode;

    /**
     * 原价
     */
    private BigDecimal originalPrice;

    /**
     * 秒杀价
     */
    private BigDecimal seckillPrice;

    /**
     * 秒杀库存
     */
    private Integer stock;

    /**
     * 每人限购数量
     */
    private Integer limitPerUser;

    /**
     * 销量
     */
    private Integer sales;

    /**
     * 排序号
     */
    private Integer sort;

    /**
     * 状态(1:启用,0:禁用)
     */
    private Integer status;

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