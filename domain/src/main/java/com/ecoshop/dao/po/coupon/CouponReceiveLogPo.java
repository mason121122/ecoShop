package com.ecoshop.dao.po.coupon;


import java.util.Date;
import lombok.Data;

/**
 * 优惠券领取记录表
 * @TableName coupon_receive_log
 */
@Data
public class CouponReceiveLogPo {
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
     * 用户名
     */
    private String username;

    /**
     * 优惠券批次ID
     */
    private Long batchId;

    /**
     * 关联活动ID
     */
    private Long activityId;

    /**
     * 领取方式(主动领取/活动赠送/系统发放)
     */
    private String receiveType;

    /**
     * 领取时间
     */
    private Date receiveTime;

    /**
     * 领取IP
     */
    private String ip;

    /**
     * User-Agent
     */
    private String userAgent;

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