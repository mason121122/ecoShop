package com.ecoshop.dao.po.order;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 售后表
 * @TableName ord_after_sale
 */
@Data
public class OrdAfterSale implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 售后编号
     */
    private String afterSaleNo;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 订单项ID
     */
    private Long orderItemId;

    /**
     * 会员ID
     */
    private Long memberId;

    /**
     * 商品ID
     */
    private Long spuId;

    /**
     * 商品名称
     */
    private String spuName;

    /**
     * SKU ID
     */
    private Long skuId;

    /**
     * SKU规格
     */
    private String skuSpec;

    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 售后类型(退款/退货退款/换货)
     */
    private String type;

    /**
     * 售后原因
     */
    private String reason;

    /**
     * 问题描述
     */
    private String description;

    /**
     * 凭证图片(JSON格式)
     */
    private String evidence;

    /**
     * 售后状态(待处理/处理中/已完成/已拒绝/已取消)
     */
    private String status;

    /**
     * 拒绝原因
     */
    private String refuseReason;

    /**
     * 退货物流单号
     */
    private String shippingCode;

    /**
     * 退货物流公司
     */
    private String shippingCompany;

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
     * 完成时间
     */
    private Date completeTime;

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