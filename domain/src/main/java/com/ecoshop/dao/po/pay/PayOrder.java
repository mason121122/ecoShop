package com.ecoshop.dao.po.pay;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 支付订单表
 * @TableName pay_order
 */
@Data
public class PayOrder implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

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
     * 支付金额
     */
    private BigDecimal amount;

    /**
     * 支付状态(待支付/支付中/支付成功/支付失败/已关闭/已退款)
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
     * 支付时间
     */
    private Date payTime;

    /**
     * 过期时间
     */
    private Date expireTime;

    /**
     * 支付成功时间
     */
    private Date successTime;

    /**
     * 关闭时间
     */
    private Date closeTime;

    /**
     * 关闭原因
     */
    private String closeReason;

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
     * 客户端IP
     */
    private String clientIp;

    /**
     * 设备类型
     */
    private String deviceType;

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