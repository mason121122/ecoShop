package com.ecoshop.dao.po.coupon;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 优惠券表
 * @TableName mkt_coupon
 */
@Data
public class MktCoupon implements Serializable {
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
     * 优惠券编码
     */
    private String code;

    /**
     * 优惠券类型(1:满减券,2:折扣券,3:无门槛券)
     */
    private Integer type;

    /**
     * 优惠金额
     */
    private BigDecimal amount;

    /**
     * 折扣率
     */
    private BigDecimal discount;

    /**
     * 最低消费金额
     */
    private BigDecimal minAmount;

    /**
     * 最高优惠金额
     */
    private BigDecimal maxDiscount;

    /**
     * 发行总量
     */
    private Integer total;

    /**
     * 已使用数量
     */
    private Integer used;

    /**
     * 每人限领张数
     */
    private Integer perLimit;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 使用类型(1:全场通用,2:指定分类,3:指定商品)
     */
    private Integer useType;

    /**
     * 指定分类ID，多个用逗号分隔
     */
    private String categoryIds;

    /**
     * 指定商品ID，多个用逗号分隔
     */
    private String spuIds;

    /**
     * 状态(1:正常,0:禁用)
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

    private static final long serialVersionUID = 1L;
}