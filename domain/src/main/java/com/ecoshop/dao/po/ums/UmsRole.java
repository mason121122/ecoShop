package com.ecoshop.dao.po.ums;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 角色表
 * @TableName ums_role
 */
@Data
public class UmsRole implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色编码
     */
    private String code;

    /**
     * 数据权限范围（全部/本机构/自定义）
     */
    private String dataScope;

    /**
     * 状态(1:启用,0:禁用)
     */
    private Integer status;

    /**
     * 是否超级管理员(1:是,0:否)
     */
    private Integer isAdmin;

    /**
     * 排序号
     */
    private Integer sort;

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