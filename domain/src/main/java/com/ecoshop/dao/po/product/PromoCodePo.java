package com.ecoshop.dao.po.product;


import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 优惠码表
 * @TableName promo_code
 */
@Data
public class PromoCodePo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 优惠码
     */
    private String code;

    /**
     * 优惠码名称
     */
    private String name;

    /**
     * 优惠码描述
     */
    private String description;

    /**
     * 优惠类型(满减/折扣/无门槛)
     */
    private String type;

    /**
     * 优惠金额/折扣
     */
    private BigDecimal value;

    /**
     * 使用门槛(满多少可用)
     */
    private BigDecimal minPoint;

    /**
     * 最高优惠金额
     */
    private BigDecimal maxDiscount;

    /**
     * 适用范围(全场通用/指定分类/指定商品)
     */
    private String productRange;

    /**
     * 指定商品ID列表
     */
    private String productIds;

    /**
     * 指定分类ID列表
     */
    private String categoryIds;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 可使用次数
     */
    private Integer totalCount;

    /**
     * 已使用次数
     */
    private Integer usedCount;

    /**
     * 每人可用次数
     */
    private Integer perLimit;

    /**
     * 状态(1:启用,0:禁用)
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
    private Date createdAt;

    /**
     * 修改时间
     */
    private Date updatedAt;

    
}