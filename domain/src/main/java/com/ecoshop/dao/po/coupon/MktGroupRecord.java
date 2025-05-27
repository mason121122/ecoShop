package com.ecoshop.dao.po.coupon;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 拼团记录表
 * @TableName mkt_group_record
 */
@Data
public class MktGroupRecord implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 拼团活动ID
     */
    private Long groupId;

    /**
     * 拼团商品ID
     */
    private Long groupSpuId;

    /**
     * 团长ID
     */
    private Long leaderId;

    /**
     * 当前人数
     */
    private Integer currentNum;

    /**
     * 状态(1:进行中,2:已成功,3:已失败)
     */
    private Integer status;

    /**
     * 成功时间
     */
    private Date successTime;

    /**
     * 过期时间
     */
    private Date expireTime;

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