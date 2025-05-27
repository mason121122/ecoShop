package com.ecoshop.dao.po.ord;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 订单日志表
 * @TableName ord_log
 */
@Data
public class OrdLog implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 操作类型
     */
    private String action;

    /**
     * 操作前状态
     */
    private String statusBefore;

    /**
     * 操作后状态
     */
    private String statusAfter;

    /**
     * 操作人ID
     */
    private Long operatorId;

    /**
     * 操作人名称
     */
    private String operatorName;

    /**
     * 操作人角色(用户/管理员)
     */
    private String operatorRole;

    /**
     * 操作内容
     */
    private String content;

    /**
     * 操作IP
     */
    private String ip;

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