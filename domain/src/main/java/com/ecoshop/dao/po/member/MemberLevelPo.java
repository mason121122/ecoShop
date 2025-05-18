package com.ecoshop.dao.po.member;


import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 会员等级表
 * @TableName member_level
 */
@Data
public class MemberLevelPo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 等级名称
     */
    private String name;

    /**
     * 等级编码
     */
    private String code;

    /**
     * 等级值
     */
    private Integer level;

    /**
     * 最低积分
     */
    private Integer minPoint;

    /**
     * 最高积分
     */
    private Integer maxPoint;

    /**
     * 折扣率
     */
    private BigDecimal discount;

    /**
     * 等级图标
     */
    private String icon;

    /**
     * 等级描述
     */
    private String description;

    /**
     * 等级特权(JSON格式)
     */
    private String privileges;

    /**
     * 状态(1:启用,0:禁用)
     */
    private Integer status;

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
    private Date createdAt;

    /**
     * 修改时间
     */
    private Date updatedAt;

    
}