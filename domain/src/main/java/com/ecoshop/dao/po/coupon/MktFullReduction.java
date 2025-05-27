package com.ecoshop.dao.po.coupon;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 满减活动表
 * @TableName mkt_full_reduction
 */
@Data
public class MktFullReduction implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 活动名称
     */
    private String name;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 使用类型(1:全场通用,2:指定分类,3:指定商品)
     */
    private Integer useType;

    /**
     * 指定分类ID，多个用逗号分隔
     */
    private String categoryIds;

    /**
     * 指定商品ID，多个用逗号分隔
     */
    private String spuIds;

    /**
     * 状态(1:正常,0:禁用)
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