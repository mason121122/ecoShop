package com.ecoshop.dao.po.coupon;


import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 优惠券表
 * @TableName coupon
 */
@Data
public class CouponPo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 优惠券名称
     */
    private String name;

    /**
     * 优惠券码
     */
    private String code;

    /**
     * 优惠券类型(满减/折扣/无门槛)
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
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 发行数量
     */
    private Integer total;

    /**
     * 已使用数量
     */
    private Integer used;

    /**
     * 每人限领数量
     */
    private Integer perLimit;

    /**
     * 状态(1:启用,0:禁用)
     */
    private Integer status;

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