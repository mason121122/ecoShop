package com.ecoshop.vo.sys.request;


import lombok.Data;

import java.util.Date;

/**
 * 权限表
 * @TableName sys_permission
 */
@Data
public class PermissionReqVo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 权限编码
     */
    private String code;

    /**
     * 关联资源ID
     */
    private Long resourceId;

    /**
     * 操作类型(GET/POST/PUT/DELETE等)
     */
    private String action;

    /**
     * 权限描述
     */
    private String description;

    /**
     * 状态(1:正常,0:禁用)
     */
    private Integer status;

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