package com.ecoshop.vo.sys.request;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
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
    @ApiModelProperty("用户名")
    @NotNull(message = "TENANT_NAME_IS_NOTNULL")
    @Size(max = 50, message = "TENANT_NAME_LENGTH_ERROR")
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
    @ApiModelProperty("联系人")
    @NotNull(message = "CONTACT_NAME_IS_NOTNULL")
    private String contactName;

    /**
     * 联系电话
     */
    @ApiModelProperty("联系电话")
    @NotNull(message = "PHONE_IS_NOTNULL")
    @Pattern(regexp = "^1[3-9]\\d{9}$", message = "PHONE_ERROR")
    private String contactPhone;

    /**
     * 联系邮箱
     */
    @ApiModelProperty("邮箱")
    @Email(message = "EMAIL_ERROR")
    private String contactEmail;

    /**
     * 过期时间
     */
    private Date expireTime;

    /**
     * 状态(1:正常,0:禁用)
     */
    @ApiModelProperty("状态(1:正常,0:禁用)")
    @NotNull(message = "STATUS_IS_NOTNULL_ERROR")
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