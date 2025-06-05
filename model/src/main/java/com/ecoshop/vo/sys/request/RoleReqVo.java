package com.ecoshop.vo.sys.request;


import lombok.Data;

import java.util.Date;

/**
 * 角色表
 * @TableName sys_role
 */
@Data
public class RoleReqVo {
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
     * 角色描述
     */
    private String description;

    /**
     * 数据范围(1:全部数据,2:本部门及下级,3:本部门,4:仅本人数据,5:自定义)
     */
    private Integer dataScope;

    /**
     * 状态(1:正常,0:禁用)
     */
    private Integer status;

    /**
     * 排序号
     */
    private Integer sort;

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