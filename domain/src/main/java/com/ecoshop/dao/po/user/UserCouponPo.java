package com.ecoshop.dao.po.user;


import java.util.Date;
import lombok.Data;

/**
 * 用户优惠券表
 * @TableName user_coupon
 */
@Data
public class UserCouponPo {
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
     * 优惠券ID
     */
    private Long couponId;

    /**
     * 优惠券码
     */
    private String couponCode;

    /**
     * 使用状态(未使用/已使用/已过期)
     */
    private String status;

    /**
     * 使用订单ID
     */
    private Long orderId;

    /**
     * 使用订单编号
     */
    private String orderNo;

    /**
     * 使用时间
     */
    private Date useTime;

    /**
     * 获取方式(主动领取/系统发放/活动赠送)
     */
    private String getType;

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