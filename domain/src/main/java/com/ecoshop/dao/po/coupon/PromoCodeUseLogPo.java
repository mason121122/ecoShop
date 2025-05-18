package com.ecoshop.dao.po.coupon;


import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 优惠码使用记录表
 * @TableName promo_code_use_log
 */
@Data
public class PromoCodeUseLogPo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 优惠码ID
     */
    private Long codeId;

    /**
     * 优惠码
     */
    private String code;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 优惠金额
     */
    private BigDecimal discountAmount;

    /**
     * 使用时间
     */
    private Date useTime;

    /**
     * 使用IP
     */
    private String ip;

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