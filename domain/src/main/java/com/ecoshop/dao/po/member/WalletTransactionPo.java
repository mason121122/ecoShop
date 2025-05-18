package com.ecoshop.dao.po.member;


import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 钱包交易记录表
 * @TableName wallet_transaction
 */
@Data
public class WalletTransactionPo {
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
     * 交易流水号
     */
    private String transactionNo;

    /**
     * 交易类型(充值/消费/退款/提现)
     */
    private String type;

    /**
     * 交易金额
     */
    private BigDecimal amount;

    /**
     * 交易前余额
     */
    private BigDecimal beforeBalance;

    /**
     * 交易后余额
     */
    private BigDecimal afterBalance;

    /**
     * 交易状态(处理中/成功/失败)
     */
    private String status;

    /**
     * 交易描述
     */
    private String description;

    /**
     * 交易来源
     */
    private String source;

    /**
     * 来源ID
     */
    private String sourceId;

    /**
     * 支付方式
     */
    private String paymentMethod;

    /**
     * 支付时间
     */
    private Date paymentTime;

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