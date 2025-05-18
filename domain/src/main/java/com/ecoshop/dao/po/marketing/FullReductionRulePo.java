package com.ecoshop.dao.po.marketing;


import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 满减规则表
 * @TableName full_reduction_rule
 */
@Data
public class FullReductionRulePo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 满减活动ID
     */
    private Long fullReductionId;

    /**
     * 满足金额
     */
    private BigDecimal threshold;

    /**
     * 优惠金额
     */
    private BigDecimal discount;

    /**
     * 赠品ID
     */
    private Long giftProductId;

    /**
     * 赠品数量
     */
    private Integer giftQuantity;

    /**
     * 排序号
     */
    private Integer sort;

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