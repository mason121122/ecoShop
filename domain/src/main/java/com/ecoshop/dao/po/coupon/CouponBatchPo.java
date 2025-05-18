package com.ecoshop.dao.po.coupon;


import java.util.Date;
import lombok.Data;

/**
 * 优惠券批次表
 * @TableName coupon_batch
 */
@Data
public class CouponBatchPo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 优惠券模板ID
     */
    private Long templateId;

    /**
     * 批次编号
     */
    private String batchNo;

    /**
     * 批次名称
     */
    private String name;

    /**
     * 批次描述
     */
    private String description;

    /**
     * 发行数量
     */
    private Integer total;

    /**
     * 已使用数量
     */
    private Integer used;

    /**
     * 已领取数量
     */
    private Integer received;

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