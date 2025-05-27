package com.ecoshop.dao.po.pay;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 退款订单表
 * @TableName pay_refund
 */
@Data
public class PayRefund implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 退款单号
     */
    private String refundNo;

    /**
     * 支付订单ID
     */
    private Long payOrderId;

    /**
     * 支付单号
     */
    private String payNo;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 会员ID
     */
    private Long memberId;

    /**
     * 支付渠道ID
     */
    private Long channelId;

    /**
     * 退款金额
     */
    private BigDecimal amount;

    /**
     * 退款原因
     */
    private String reason;

    /**
     * 退款状态(待退款/退款中/退款成功/退款失败)
     */
    private String status;

    /**
     * 交易号
     */
    private String tradeNo;

    /**
     * 交易状态
     */
    private String tradeStatus;

    /**
     * 退款成功时间
     */
    private Date successTime;

    /**
     * 通知时间
     */
    private Date notifyTime;

    /**
     * 通知状态(0:未通知,1:通知成功,2:通知失败)
     */
    private Integer notifyStatus;

    /**
     * 通知次数
     */
    private Integer notifyCount;

    /**
     * 最后通知时间
     */
    private Date lastNotifyTime;

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