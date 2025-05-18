package com.ecoshop.dao.po.product;


import java.util.Date;
import lombok.Data;

/**
 * 商品与规格关联表
 * @TableName product_specification
 */
@Data
public class ProductSpecificationPo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 商品ID
     */
    private Long productId;

    /**
     * 规格ID
     */
    private Long specId;

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