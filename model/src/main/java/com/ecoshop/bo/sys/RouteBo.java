package com.ecoshop.bo.sys;


import lombok.Data;

import java.util.Date;

/**
 * 路由表
 * @TableName sys_route
 */
@Data
public class RouteBo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 父路由ID
     */
    private Long parentId;

    /**
     * 路由名称
     */
    private String name;

    /**
     * 路由路径
     */
    private String path;

    /**
     * 组件路径
     */
    private String component;

    /**
     * 重定向路径
     */
    private String redirect;

    /**
     * 元数据(JSON格式)
     */
    private Object meta;

    /**
     * 排序号
     */
    private Integer sort;

    /**
     * 是否隐藏(1:是,0:否)
     */
    private Integer hidden;

    /**
     * 状态(1:正常,0:禁用)
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;

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