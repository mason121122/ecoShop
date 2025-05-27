package com.ecoshop.dao.po.coupon;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 拼团商品表
 * @TableName mkt_group_spu
 */
@Data
public class MktGroupSpu implements Serializable {
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
     * 商品ID
     */
    private Long spuId;

    /**
     * 拼团价格
     */
    private BigDecimal groupPrice;

    /**
     * 成团人数
     */
    private Integer groupNumber;

    /**
     * 每人限购数量
     */
    private Integer groupLimit;

    /**
     * 排序号
     */
    private Integer sort;

    /**
     * 状态(1:正常,0:禁用)
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