package com.ecoshop.dao.po.product;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 商品信息表
 */
@Data
public class ProductPO {
    
    /**
     * 主键ID
     */
    private Long id;
    
    /**
     * 租户ID
     */
    private Long tenantId;
    
    /**
     * 分类ID
     */
    private Long categoryId;
    
    /**
     * 商品编码
     */
    private String code;
    
    /**
     * 商品名称
     */
    private String name;
    
    /**
     * 商品简介
     */
    private String brief;
    
    /**
     * 商品详情
     */
    private String description;
    
    /**
     * 商品主图
     */
    private String mainImage;
    
    /**
     * 商品图片列表，多个图片用逗号分隔
     */
    private String subImages;
    
    /**
     * 商品规格类型：0-单规格，1-多规格
     */
    private Integer specType;
    
    /**
     * 商品单位
     */
    private String unit;
    
    /**
     * 商品重量，默认为克
     */
    private BigDecimal weight;
    
    /**
     * 商品体积，默认为立方厘米
     */
    private BigDecimal volume;
    
    /**
     * 商品原价
     */
    private BigDecimal originalPrice;
    
    /**
     * 商品现价
     */
    private BigDecimal currentPrice;
    
    /**
     * 商品成本价
     */
    private BigDecimal costPrice;
    
    /**
     * 最低价格（多规格商品）
     */
    private BigDecimal minPrice;
    
    /**
     * 最高价格（多规格商品）
     */
    private BigDecimal maxPrice;
    
    /**
     * 商品库存
     */
    private Integer stock;
    
    /**
     * 库存预警值
     */
    private Integer lowStock;
    
    /**
     * 商品销量
     */
    private Integer sales;
    
    /**
     * 商品浏览量
     */
    private Integer views;
    
    /**
     * 商品评价数
     */
    private Integer commentCount;
    
    /**
     * 好评数
     */
    private Integer goodCommentCount;
    
    /**
     * 商品评分
     */
    private BigDecimal commentScore;
    
    /**
     * 是否热卖(1:是 0:否)
     */
    private Integer isHot;
    
    /**
     * 是否新品(1:是 0:否)
     */
    private Integer isNew;
    
    /**
     * 是否推荐(1:是 0:否)
     */
    private Integer isRecommend;
    
    /**
     * 是否上架(1:是 0:否)
     */
    private Integer isOnSale;
    
    /**
     * 排序号
     */
    private Integer sort;
    
    /**
     * 状态(1:正常 0:禁用)
     */
    private Integer status;
    
    /**
     * 备注
     */
    private String remark;
    
    /**
     * 版本号
     */
    private Integer version;
    
    /**
     * 创建时间
     */
    private LocalDateTime createdAt;
    
    /**
     * 修改时间
     */
    private LocalDateTime updatedAt;
} 