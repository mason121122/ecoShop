package com.ecoshop.dao.po.order;


import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 退款记录表
 * @TableName refund
 */
@Data
public class RefundPo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 退款编号
     */
    private String refundNo;

    /**
     * 支付记录ID
     */
    private Long paymentId;

    /**
     * 退款金额
     */
    private BigDecimal refundAmount;

    /**
     * 退款原因
     */
    private String reason;

    /**
     * 退款方式(原路退回/退到余额)
     */
    private String refundType;

    /**
     * 退款状态(待处理/处理中/已退款/已拒绝)
     */
    private String status;

    /**
     * 拒绝原因
     */
    private String refuseReason;

    /**
     * 处理人ID
     */
    private Long operatorId;

    /**
     * 处理人名称
     */
    private String operatorName;

    /**
     * 处理时间
     */
    private Date handleTime;

    /**
     * 退款时间
     */
    private Date refundTime;

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