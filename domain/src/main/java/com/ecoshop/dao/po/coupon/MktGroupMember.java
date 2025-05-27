package com.ecoshop.dao.po.coupon;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 拼团成员表
 * @TableName mkt_group_member
 */
@Data
public class MktGroupMember implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 拼团记录ID
     */
    private Long groupRecordId;

    /**
     * 会员ID
     */
    private Long memberId;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 是否团长(1:是,0:否)
     */
    private Integer isLeader;

    /**
     * 状态(1:待支付,2:已支付,3:已退款)
     */
    private Integer status;

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