package com.ecoshop.dao.po.member;


import java.util.Date;
import lombok.Data;

/**
 * 积分记录表
 * @TableName points_record
 */
@Data
public class PointsRecordPo {
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
     * 类型(获取/消费/过期/调整)
     */
    private String type;

    /**
     * 积分变动值
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
     * 变动描述
     */
    private String description;

    /**
     * 积分来源(订单/活动/签到/管理员)
     */
    private String source;

    /**
     * 来源ID
     */
    private String sourceId;

    /**
     * 过期时间
     */
    private Date expireTime;

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