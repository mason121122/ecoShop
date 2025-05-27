package com.ecoshop.dao.po.mms;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 会员登录记录表
 * @TableName mbr_login_log
 */
@Data
public class MbrLoginLog implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 会员ID
     */
    private Long memberId;

    /**
     * 登录方式(账号密码/手机验证码/第三方)
     */
    private String loginType;

    /**
     * 登录IP
     */
    private String loginIp;

    /**
     * 登录地点
     */
    private String loginLocation;

    /**
     * 设备类型
     */
    private String deviceType;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 浏览器类型
     */
    private String browserType;

    /**
     * 浏览器版本
     */
    private String browserVersion;

    /**
     * 操作系统类型
     */
    private String osType;

    /**
     * 操作系统版本
     */
    private String osVersion;

    /**
     * 状态(1:成功,0:失败)
     */
    private Integer status;

    /**
     * 消息提示
     */
    private String msg;

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