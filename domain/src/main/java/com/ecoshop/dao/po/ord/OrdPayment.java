package com.ecoshop.dao.po.ord;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 支付记录表
 * @TableName ord_payment
 */
@Data
public class OrdPayment implements Serializable {
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
     * 会员ID
     */
    private Long memberId;

    /**
     * 支付方式(微信/支付宝/银行卡)
     */
    private String paymentType;

    /**
     * 支付流水号
     */
    private String paymentSerialNo;

    /**
     * 交易号
     */
    private String tradeNo;

    /**
     * 支付金额
     */
    private BigDecimal amount;

    /**
     * 支付状态(待支付/支付成功/支付失败/已退款)
     */
    private String status;

    /**
     * 支付时间
     */
    private Date paymentTime;

    /**
     * 回调时间
     */
    private Date callbackTime;

    /**
     * 回调内容
     */
    private String callbackContent;

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