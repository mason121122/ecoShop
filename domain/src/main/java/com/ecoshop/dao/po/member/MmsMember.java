package com.ecoshop.dao.po.member;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 会员信息表
 * @TableName mms_member
 */
@Data
public class MmsMember implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * C端用户ID
     */
    private Long customerId;

    /**
     * 等级ID
     */
    private Long levelId;

    /**
     * 积分
     */
    private Integer points;

    /**
     * 消费金额
     */
    private BigDecimal consumptionAmount;

    /**
     * 消费次数
     */
    private Integer consumptionCount;

    /**
     * 最后消费时间
     */
    private Date lastConsumptionTime;

    /**
     * 状态(1:正常,0:冻结)
     */
    private Integer status;

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