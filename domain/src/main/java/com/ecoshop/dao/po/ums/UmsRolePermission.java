package com.ecoshop.dao.po.ums;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 角色与权限关联表
 * @TableName ums_role_permission
 */
@Data
public class UmsRolePermission implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 权限ID
     */
    private Long permissionId;

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