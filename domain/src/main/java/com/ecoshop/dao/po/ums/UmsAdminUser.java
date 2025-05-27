package com.ecoshop.dao.po.ums;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 中台用户表
 * @TableName ums_admin_user
 */
@Data
public class UmsAdminUser implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 性别(M:男 F:女)
     */
    private String gender;

    /**
     * 头像URL
     */
    private String avatar;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 所属机构ID
     */
    private Long orgId;

    /**
     * 状态(1:启用,0:禁用)
     */
    private Integer status;

    /**
     * 最后登录时间
     */
    private Date lastLoginAt;

    /**
     * 最后登录IP
     */
    private String loginIp;

    /**
     * 登录次数
     */
    private Integer loginCount;

    /**
     * 密码错误次数
     */
    private Integer passwordErrorCount;

    /**
     * 锁定截止时间
     */
    private Date lockedUntil;

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