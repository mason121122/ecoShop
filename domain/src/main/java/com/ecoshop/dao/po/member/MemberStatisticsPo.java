package com.ecoshop.dao.po.member;


import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 会员统计表
 * @TableName member_statistics
 */
@Data
public class MemberStatisticsPo {
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
     * 订单总数
     */
    private Integer totalOrderCount;

    /**
     * 订单总金额
     */
    private BigDecimal totalOrderAmount;

    /**
     * 累计获得积分
     */
    private Integer totalPointsGained;

    /**
     * 累计使用积分
     */
    private Integer totalPointsUsed;

    /**
     * 领取优惠券数
     */
    private Integer totalCouponCount;

    /**
     * 使用优惠券数
     */
    private Integer usedCouponCount;

    /**
     * 收藏商品数
     */
    private Integer favoriteProductCount;

    /**
     * 评价数
     */
    private Integer reviewCount;

    /**
     * 退货订单数
     */
    private Integer returnOrderCount;

    /**
     * 最后登录时间
     */
    private Date lastLoginTime;

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