package com.ecoshop.dao.po.ums;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * C端用户表
 * @TableName ums_customer
 */
@Data
public class UmsCustomer implements Serializable {
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
     * 昵称
     */
    private String nickname;

    /**
     * 头像URL
     */
    private String avatar;

    /**
     * 性别(M:男 F:女)
     */
    private String gender;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String phone;

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
     * 注册来源
     */
    private String registerSource;

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