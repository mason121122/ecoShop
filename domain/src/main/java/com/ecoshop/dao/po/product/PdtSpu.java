package com.ecoshop.dao.po.product;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 商品表
 * @TableName pdt_spu
 */
@Data
public class PdtSpu implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品编码
     */
    private String code;

    /**
     * 分类ID
     */
    private Long categoryId;

    /**
     * 品牌ID
     */
    private Long brandId;

    /**
     * 主图
     */
    private String mainImage;

    /**
     * 子图(JSON格式)
     */
    private String subImages;

    /**
     * 商品详情
     */
    private String detail;

    /**
     * 售价
     */
    private BigDecimal price;

    /**
     * 市场价
     */
    private BigDecimal marketPrice;

    /**
     * 成本价
     */
    private BigDecimal costPrice;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 销量
     */
    private Integer sales;

    /**
     * 单位
     */
    private String unit;

    /**
     * 重量(kg)
     */
    private BigDecimal weight;

    /**
     * 状态(1:上架,0:下架)
     */
    private Integer status;

    /**
     * 是否新品(1:是,0:否)
     */
    private Integer isNew;

    /**
     * 是否热销(1:是,0:否)
     */
    private Integer isHot;

    /**
     * 是否推荐(1:是,0:否)
     */
    private Integer isRecommend;

    /**
     * 关键字
     */
    private String keywords;

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
    private Date createdAt;

    /**
     * 修改时间
     */
    private Date updatedAt;

    private static final long serialVersionUID = 1L;
}