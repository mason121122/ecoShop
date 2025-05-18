package com.ecoshop.dao.po.member;


import java.util.Date;
import lombok.Data;

/**
 * 会员成长值记录表
 * @TableName member_growth_record
 */
@Data
public class MemberGrowthRecordPo {
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
     * 变动描述
     */
    private String description;

    /**
     * 成长值来源
     */
    private String source;

    /**
     * 来源ID
     */
    private String sourceId;

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