package com.ecoshop.dao.po.mms;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 积分记录表
 * @TableName mbr_points_log
 */
@Data
public class MbrPointsLog implements Serializable {
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
     * 类型(签到/购物/评价/活动)
     */
    private String type;

    /**
     * 积分变动
     */
    private Integer points;

    /**
     * 变动前积分
     */
    private Integer beforePoints;

    /**
     * 变动后积分
     */
    private Integer afterPoints;

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