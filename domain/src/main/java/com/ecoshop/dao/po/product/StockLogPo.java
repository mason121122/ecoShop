package com.ecoshop.dao.po.product;


import java.util.Date;
import lombok.Data;

/**
 * 库存变动记录表
 * @TableName stock_log
 */
@Data
public class StockLogPo {
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
     * SKU ID
     */
    private Long skuId;

    /**
     * 变动前库存
     */
    private Integer beforeStock;

    /**
     * 变动数量
     */
    private Integer changeAmount;

    /**
     * 变动后库存
     */
    private Integer afterStock;

    /**
     * 变动类型(入库/出库/调整)
     */
    private String type;

    /**
     * 变动原因
     */
    private String reason;

    /**
     * 关联订单ID
     */
    private Long orderId;

    /**
     * 操作人ID
     */
    private Long operatorId;

    /**
     * 操作人名称
     */
    private String operatorName;

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