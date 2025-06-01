package com.ecoshop.bo.sys;


import lombok.Data;

import java.util.Date;

/**
 * 用户-机构-岗位关联表
 * @TableName sys_user_position
 */
@Data
public class UserPositionBo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 机构ID
     */
    private Long orgId;

    /**
     * 岗位ID
     */
    private Long positionId;

    /**
     * 是否主岗(1:是,0:否)
     */
    private Integer isPrimary;

    /**
     * 开始日期
     */
    private Date startDate;

    /**
     * 结束日期
     */
    private Date endDate;

    /**
     * 状态(1:正常,0:禁用)
     */
    private Integer status;

    /**
     * 版本号(用于乐观锁)
     */
    private Integer version;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 修改时间(自动更新)
     */
    private Date updatedAt;

}