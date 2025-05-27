package com.ecoshop.dao.po.coupon;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 会员优惠券表
 * @TableName mkt_member_coupon
 */
@Data
public class MktMemberCoupon implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 会员ID
     */
    private Long memberId;

    /**
     * 优惠券ID
     */
    private Long couponId;

    /**
     * 优惠券码
     */
    private String couponCode;

    /**
     * 状态(1:未使用,2:已使用,3:已过期)
     */
    private Integer status;

    /**
     * 使用订单ID
     */
    private Long orderId;

    /**
     * 使用时间
     */
    private Date useTime;

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