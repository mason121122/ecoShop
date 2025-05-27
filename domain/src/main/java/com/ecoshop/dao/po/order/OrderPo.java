package com.ecoshop.dao.po.order;

import lombok.Data;
import java.time.LocalDateTime;

/**
 * 订单主表
 */
@Data
public class OrderPO {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 订单类型（1普通订单 2秒杀订单 3团购订单）
     */
    private Integer orderType;

    /**
     * 订单状态（1待付款 2待发货 3待收货 4已完成 5已取消）
     */
    private Integer status;

    /**
     * 支付状态（1未支付 2已支付 3已退款）
     */
    private Integer payStatus;

    /**
     * 支付方式（1微信 2支付宝）
     */
    private Integer payType;

    /**
     * 支付时间
     */
    private LocalDateTime payTime;

    /**
     * 支付金额（分）
     */
    private Integer payAmount;

    /**
     * 商品总金额（分）
     */
    private Integer totalAmount;

    /**
     * 运费金额（分）
     */
    private Integer freightAmount;

    /**
     * 优惠金额（分）
     */
    private Integer discountAmount;

    /**
     * 收货人姓名
     */
    private String receiverName;

    /**
     * 收货人电话
     */
    private String receiverPhone;

    /**
     * 收货人省份
     */
    private String receiverProvince;

    /**
     * 收货人城市
     */
    private String receiverCity;

    /**
     * 收货人区县
     */
    private String receiverDistrict;

    /**
     * 收货人详细地址
     */
    private String receiverAddress;

    /**
     * 物流公司
     */
    private String logisticsCompany;

    /**
     * 物流单号
     */
    private String logisticsNo;

    /**
     * 发货时间
     */
    private LocalDateTime deliveryTime;

    /**
     * 收货时间
     */
    private LocalDateTime receiveTime;

    /**
     * 完成时间
     */
    private LocalDateTime finishTime;

    /**
     * 取消时间
     */
    private LocalDateTime cancelTime;

    /**
     * 取消原因
     */
    private String cancelReason;

    /**
     * 买家备注
     */
    private String buyerRemark;

    /**
     * 卖家备注
     */
    private String sellerRemark;

    /**
     * 删除标记（0未删除 1已删除）
     */
    private Integer deleted;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 修改时间
     */
    private LocalDateTime updatedAt;
} 