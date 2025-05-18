package com.ecoshop.dao.po.product;


import java.util.Date;
import lombok.Data;

/**
 * 商品收藏表
 * @TableName product_favorite
 */
@Data
public class ProductFavoritePo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 商品ID
     */
    private Long productId;

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