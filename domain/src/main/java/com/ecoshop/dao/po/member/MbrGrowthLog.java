package com.ecoshop.dao.po.member;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 成长值记录表
 * @TableName mbr_growth_log
 */
@Data
public class MbrGrowthLog implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 会员ID
     */
    private Long memberId;

    /**
     * 类型(购物/评价/活动)
     */
    private String type;

    /**
     * 成长值变动
     */
    private Integer growth;

    /**
     * 变动前成长值
     */
    private Integer beforeGrowth;

    /**
     * 变动后成长值
     */
    private Integer afterGrowth;

    /**
     * 关联订单ID
     */
    private Long orderId;

    /**
     * 变动描述
     */
    private String description;

    /**
     * 操作人ID
     */
    private Long operatorId;

    /**
     * 操作人名称
     */
    private String operatorName;

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