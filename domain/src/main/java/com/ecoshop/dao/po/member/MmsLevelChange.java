package com.ecoshop.dao.po.member;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 会员等级变更记录表
 * @TableName mms_level_change
 */
@Data
public class MmsLevelChange implements Serializable {
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
     * 变更前等级ID
     */
    private Long beforeLevelId;

    /**
     * 变更后等级ID
     */
    private Long afterLevelId;

    /**
     * 变更类型(升级/降级/调整)
     */
    private String changeType;

    /**
     * 变更原因
     */
    private String changeReason;

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

    private static final long serialVersionUID = 1L;
}