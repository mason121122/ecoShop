package com.ecoshop.dao.po.sys;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 操作日志表
 * @TableName sys_oper_log
 */
@Data
public class SysOperLog implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 模块标题
     */
    private String title;

    /**
     * 业务类型(0:其它,1:新增,2:修改,3:删除,4:授权,5:导出,6:导入,7:强退,8:生成代码,9:清空数据)
     */
    private Integer businessType;

    /**
     * 方法名称
     */
    private String method;

    /**
     * 请求方式
     */
    private String requestMethod;

    /**
     * 请求URL
     */
    private String requestUrl;

    /**
     * 主机地址
     */
    private String requestIp;

    /**
     * 操作地点
     */
    private String requestLocation;

    /**
     * 请求参数
     */
    private String requestParams;

    /**
     * 返回参数
     */
    private String responseResult;

    /**
     * 操作状态(1:正常,0:异常)
     */
    private Integer status;

    /**
     * 错误消息
     */
    private String errorMsg;

    /**
     * 操作人ID
     */
    private Long operatorId;

    /**
     * 操作人名称
     */
    private String operatorName;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 消耗时间
     */
    private Long costTime;

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