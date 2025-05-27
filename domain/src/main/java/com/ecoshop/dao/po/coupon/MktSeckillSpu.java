package com.ecoshop.dao.po.coupon;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 秒杀商品表
 * @TableName mkt_seckill_spu
 */
@Data
public class MktSeckillSpu implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 秒杀活动ID
     */
    private Long seckillId;

    /**
     * 商品ID
     */
    private Long spuId;

    /**
     * 秒杀价格
     */
    private BigDecimal seckillPrice;

    /**
     * 秒杀库存
     */
    private Integer seckillStock;

    /**
     * 每人限购数量
     */
    private Integer seckillLimit;

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