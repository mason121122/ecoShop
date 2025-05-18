package com.ecoshop.dao.po.user;


import java.util.Date;
import lombok.Data;

/**
 * 租户表
 * @TableName tenant
 */
@Data
public class TenantPo {
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
     * 联系人
     */
    private String contact;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 联系邮箱
     */
    private String email;

    /**
     * 地址
     */
    private String address;

    /**
     * 状态(1:启用,0:禁用)
     */
    private Integer status;

    /**
     * 到期时间
     */
    private Date expireTime;

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

    
}