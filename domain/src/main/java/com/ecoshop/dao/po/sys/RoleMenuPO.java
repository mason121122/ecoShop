package com.ecoshop.dao.po.sys;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 角色菜单关联表
 */
@Data
public class RoleMenuPO {
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
    private LocalDateTime createdAt;

    /**
     * 修改时间
     */
    private LocalDateTime updatedAt;
} 