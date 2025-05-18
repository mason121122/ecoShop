package com.ecoshop.dao.po.user;


import java.util.Date;
import lombok.Data;

/**
 * 登录日志表
 * @TableName login_log
 */
@Data
public class LoginLogPo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 登录IP
     */
    private String ip;

    /**
     * User-Agent
     */
    private String userAgent;

    /**
     * 登录状态(1:成功,0:失败)
     */
    private Integer status;

    /**
     * 登录信息
     */
    private String msg;

    /**
     * 登录时间
     */
    private Date loginTime;

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