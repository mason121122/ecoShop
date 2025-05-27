package com.ecoshop.dao.po.order;

import lombok.Data;
import java.time.LocalDateTime;

/**
 * 订单操作日志表
 */
@Data
public class OrderLogPO {

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
     * 操作人ID
     */
    private Long operatorId;

    /**
     * 操作人类型（1系统 2用户 3商家 4管理员）
     */
    private Integer operatorType;

    /**
     * 操作人名称
     */
    private String operatorName;

    /**
     * 操作类型（1创建订单 2支付订单 3发货 4收货 5完成 6取消）
     */
    private Integer operationType;

    /**
     * 操作描述
     */
    private String operationDesc;

    /**
     * IP地址
     */
    private String ipaddr;

    /**
     * 操作地点
     */
    private String location;

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
    private LocalDateTime createdAt;

    /**
     * 修改时间
     */
    private LocalDateTime updatedAt;
} 