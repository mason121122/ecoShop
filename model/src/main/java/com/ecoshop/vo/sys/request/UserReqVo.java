package com.ecoshop.vo.sys.request;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * 用户表
 *
 * @TableName sys_user
 */
@Data
public class UserReqVo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
//    private Long tenantId;

    /**
     * 用户名
     */
    @ApiModelProperty("用户名")
    @NotNull(message = "USERNAME_IS_NOTNULL")
    @Size(max = 50, message = "USERNAME_LENGTH_ERROR")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty("密码")
    @Size(max = 18, message = "PASSWORD_LENGTH_ERROR")
    private String password;

    /**
     * 真实姓名
     */
    @ApiModelProperty("真实姓名")
    @NotNull(message = "REAL_NAME_IS_NOTNULL")
    @Size(max = 50, message = "REAL_NAME_LENGTH_ERROR")
    private String realName;

    /**
     * 头像
     */
    @ApiModelProperty("头像")
    private String avatar;

    /**
     * 邮箱
     */
    @ApiModelProperty("邮箱")
    @Email(message = "EMAIL_ERROR")
    private String email;

    /**
     * 手机号
     */
    @ApiModelProperty("手机号")
    @Pattern(regexp = "^1[3-9]\\d{9}$", message = "PHONE_ERROR")
    private String phone;

    /**
     * 状态(1:正常,0:禁用)
     */
    @ApiModelProperty("状态(1:正常,0:禁用)")
    @NotNull(message = "STATUS_IS_NOTNULL_ERROR")
    private Integer status;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remark;

    /**
     * 版本号(用于乐观锁)
     */
    @ApiModelProperty("版本号")
    private Integer version;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createdAt;

    /**
     * 修改时间(自动更新)
     */
    @ApiModelProperty("修改时间")
    private Date updatedAt;

}