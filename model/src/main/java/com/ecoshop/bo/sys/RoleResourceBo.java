package com.ecoshop.bo.sys;


import lombok.Data;

import java.util.Date;

/**
 * 角色-权限关联表
 * @TableName sys_role_permission
 */
@Data
public class RoleResourceBo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 资源ID
     */
    private Long resourceId;

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