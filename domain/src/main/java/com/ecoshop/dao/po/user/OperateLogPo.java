package com.ecoshop.dao.po.user;


import java.util.Date;
import lombok.Data;

/**
 * 操作日志表
 * @TableName operate_log
 */
@Data
public class OperateLogPo {
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
     * 操作模块
     */
    private String module;

    /**
     * 业务类型
     */
    private String businessType;

    /**
     * 方法名
     */
    private String method;

    /**
     * 请求URL
     */
    private String requestUrl;

    /**
     * 请求方式
     */
    private String requestMethod;

    /**
     * 请求参数
     */
    private String requestParam;

    /**
     * 响应数据
     */
    private String responseData;

    /**
     * 操作IP
     */
    private String ip;

    /**
     * 操作状态(1:成功,0:失败)
     */
    private Integer status;

    /**
     * 错误消息
     */
    private String errorMsg;

    /**
     * 操作时间
     */
    private Date operateTime;

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