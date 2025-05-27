package com.ecoshop.dao.po.sys;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 租户表
 * @TableName sys_tenant
 */
@Data
public class SysTenant implements Serializable {
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