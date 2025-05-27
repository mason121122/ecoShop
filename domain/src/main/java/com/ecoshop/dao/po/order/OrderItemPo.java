package com.ecoshop.dao.po.order;

import lombok.Data;
import java.time.LocalDateTime;

/**
 * 订单明细表
 */
@Data
public class OrderItemPO {

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
     * 商品ID
     */
    private Long productId;

    /**
     * 商品规格ID
     */
    private Long specId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品图片
     */
    private String productImage;

    /**
     * 商品规格值
     */
    private String specValues;

    /**
     * 商品单价（分）
     */
    private Integer price;

    /**
     * 商品数量
     */
    private Integer quantity;

    /**
     * 商品总价（分）
     */
    private Integer totalAmount;

    /**
     * 优惠金额（分）
     */
    private Integer discountAmount;

    /**
     * 实付金额（分）
     */
    private Integer payAmount;

    /**
     * 是否已评价（0未评价 1已评价）
     */
    private Integer isReviewed;

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
    private LocalDateTime createdAt;

    /**
     * 修改时间
     */
    private LocalDateTime updatedAt;
} 