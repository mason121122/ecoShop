package com.ecoshop.dao.po.sys;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 角色表
 * @TableName sys_role
 */
@Data
public class SysRole implements Serializable {
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
     * 状态(1:正常,0:禁用)
     */
    private Integer status;

    /**
     * 数据范围(1:全部,2:自定义,3:本部门,4:本部门及以下,5:仅本人)
     */
    private Integer dataScope;

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