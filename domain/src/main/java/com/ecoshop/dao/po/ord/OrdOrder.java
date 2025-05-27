package com.ecoshop.dao.po.ord;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 订单表
 * @TableName ord_order
 */
@Data
public class OrdOrder implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 会员ID
     */
    private Long memberId;

    /**
     * 订单总金额
     */
    private BigDecimal totalAmount;

    /**
     * 实付金额
     */
    private BigDecimal payAmount;

    /**
     * 运费
     */
    private BigDecimal freightAmount;

    /**
     * 优惠金额
     */
    private BigDecimal discountAmount;

    /**
     * 优惠券抵扣金额
     */
    private BigDecimal couponAmount;

    /**
     * 积分抵扣金额
     */
    private BigDecimal pointsAmount;

    /**
     * 支付方式(微信/支付宝/银行卡)
     */
    private String paymentType;

    /**
     * 支付时间
     */
    private Date paymentTime;

    /**
     * 支付流水号
     */
    private String paymentSerialNo;

    /**
     * 订单状态(待付款/已付款/已发货/已完成/已取消/已退款)
     */
    private String status;

    /**
     * 收货人姓名
     */
    private String shippingName;

    /**
     * 收货人电话
     */
    private String shippingPhone;

    /**
     * 收货地址
     */
    private String shippingAddress;

    /**
     * 物流单号
     */
    private String shippingCode;

    /**
     * 物流公司
     */
    private String shippingCompany;

    /**
     * 发货时间
     */
    private Date shippingTime;

    /**
     * 收货时间
     */
    private Date receiveTime;

    /**
     * 关闭时间
     */
    private Date closeTime;

    /**
     * 关闭原因
     */
    private String closeReason;

    /**
     * 订单备注
     */
    private String remark;

    /**
     * 订单来源(PC/APP/小程序/H5)
     */
    private String source;

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