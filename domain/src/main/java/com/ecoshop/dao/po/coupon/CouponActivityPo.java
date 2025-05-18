package com.ecoshop.dao.po.coupon;


import java.util.Date;
import lombok.Data;

/**
 * 优惠券活动表
 * @TableName coupon_activity
 */
@Data
public class CouponActivityPo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 活动名称
     */
    private String name;

    /**
     * 活动编码
     */
    private String code;

    /**
     * 活动描述
     */
    private String description;

    /**
     * 活动类型(注册赠券/满额送券/定向发券/新人专享)
     */
    private String type;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 状态(1:启用,0:禁用)
     */
    private Integer status;

    /**
     * 规则配置(JSON格式)
     */
    private String ruleConfig;

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