package com.ecoshop.dao.po.coupon;


import java.util.Date;
import lombok.Data;

/**
 * 活动与优惠券关联表
 * @TableName activity_coupon
 */
@Data
public class ActivityCouponPo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 优惠券批次ID
     */
    private Long batchId;

    /**
     * 每人可领数量
     */
    private Integer quantity;

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