package com.ecoshop.dao.po.coupon;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 满减规则表
 * @TableName mkt_full_reduction_rule
 */
@Data
public class MktFullReductionRule implements Serializable {
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
    private BigDecimal fullAmount;

    /**
     * 减少金额
     */
    private BigDecimal reductionAmount;

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