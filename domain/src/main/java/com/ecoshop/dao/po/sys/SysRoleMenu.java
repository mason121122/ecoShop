package com.ecoshop.dao.po.sys;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 角色菜单关联表
 * @TableName sys_role_menu
 */
@Data
public class SysRoleMenu implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 菜单ID
     */
    private Long menuId;

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