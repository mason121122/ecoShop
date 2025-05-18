package com.ecoshop.dao.po.product;


import java.util.Date;
import lombok.Data;

/**
 * 商品评价表
 * @TableName product_review
 */
@Data
public class ProductReviewPo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 商品ID
     */
    private Long productId;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 评分(1-5)
     */
    private Integer rating;

    /**
     * 评价内容
     */
    private String content;

    /**
     * 评价图片(JSON格式)
     */
    private String images;

    /**
     * 商家回复
     */
    private String reply;

    /**
     * 回复时间
     */
    private Date replyTime;

    /**
     * 状态(1:显示,0:隐藏)
     */
    private Integer status;

    /**
     * 是否匿名(1:是,0:否)
     */
    private Integer isAnonymous;

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