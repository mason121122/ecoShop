package com.ecoshop.bo.sys;


import lombok.Data;

import java.util.Date;

/**
 * 岗位-角色关联表
 * @TableName sys_position_role
 */
@Data
public class PositionRoleBo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 岗位ID
     */
    private Long positionId;

    /**
     * 角色ID
     */
    private Long roleId;

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