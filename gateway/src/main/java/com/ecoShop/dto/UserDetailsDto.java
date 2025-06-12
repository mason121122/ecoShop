package com.ecoShop.dto;

import lombok.Data;


@Data
public class UserDetailsDto {

    /**
     * 用户id
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
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 状态(1:正常,0:禁用)
     */
    private Integer status;

}
