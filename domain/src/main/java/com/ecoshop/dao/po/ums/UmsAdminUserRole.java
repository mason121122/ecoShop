package com.ecoshop.dao.po.ums;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 中台用户与角色关联表
 * @TableName ums_admin_user_role
 */
@Data
public class UmsAdminUserRole implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 分配人
     */
    private String assignedBy;

    /**
     * 分配时间
     */
    private Date assignedAt;

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