package com.ecoshop.dao.po.pay;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 支付通知记录表
 * @TableName pay_notify_log
 */
@Data
public class PayNotifyLog implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 支付订单ID
     */
    private Long payOrderId;

    /**
     * 退款订单ID
     */
    private Long refundOrderId;

    /**
     * 通知类型(支付/退款)
     */
    private String type;

    /**
     * 请求参数
     */
    private String requestParams;

    /**
     * 响应参数
     */
    private String responseParams;

    /**
     * 执行状态(0:失败,1:成功)
     */
    private Integer executeStatus;

    /**
     * 执行消息
     */
    private String executeMsg;

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