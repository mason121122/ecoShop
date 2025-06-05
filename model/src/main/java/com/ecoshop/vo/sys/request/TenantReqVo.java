package com.ecoshop.vo.sys.request;


import lombok.Data;

import java.util.Date;

/**
 * 租户表
 * @TableName sys_tenant
 */
@Data
public class TenantReqVo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户名称
     */
    private String name;

    /**
     * 租户编码
     */
    private String code;

    /**
     * 域名
     */
    private String domain;

    /**
     * Logo
     */
    private String logo;

    /**
     * 联系人
     */
    private String contactName;

    /**
     * 联系电话
     */
    private String contactPhone;

    /**
     * 联系邮箱
     */
    private String contactEmail;

    /**
     * 过期时间
     */
    private Date expireTime;

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