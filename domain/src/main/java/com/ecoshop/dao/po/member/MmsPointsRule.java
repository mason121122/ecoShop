package com.ecoshop.dao.po.member;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 积分规则表
 * @TableName mms_points_rule
 */
@Data
public class MmsPointsRule implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 规则名称
     */
    private String name;

    /**
     * 规则编码
     */
    private String code;

    /**
     * 规则类型(注册/购物/签到/评价)
     */
    private String type;

    /**
     * 积分值
     */
    private Integer points;

    /**
     * 每日最大积分
     */
    private Integer maxPointsPerDay;

    /**
     * 每日最大次数
     */
    private Integer maxTimesPerDay;

    /**
     * 规则描述
     */
    private String description;

    /**
     * 状态(1:启用,0:禁用)
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