package com.ecoshop.dao.po.sys;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 菜单表
 * @TableName sys_menu
 */
@Data
public class SysMenu implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 父菜单ID
     */
    private Long parentId;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 路由地址
     */
    private String path;

    /**
     * 组件路径
     */
    private String component;

    /**
     * 菜单类型(1:目录,2:菜单,3:按钮)
     */
    private Integer type;

    /**
     * 菜单图标
     */
    private String icon;

    /**
     * 排序号
     */
    private Integer sort;

    /**
     * 权限标识
     */
    private String permission;

    /**
     * 状态(1:显示,0:隐藏)
     */
    private Integer status;

    /**
     * 是否缓存(1:是,0:否)
     */
    private Integer isCache;

    /**
     * 是否外链(1:是,0:否)
     */
    private Integer isFrame;

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