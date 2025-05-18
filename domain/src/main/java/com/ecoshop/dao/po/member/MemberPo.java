package com.ecoshop.dao.po.member;


import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 会员信息表
 * @TableName member
 */
@Data
public class MemberPo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 等级ID
     */
    private Long levelId;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 性别(M:男 F:女)
     */
    private String gender;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 积分
     */
    private Integer points;

    /**
     * 消费金额
     */
    private BigDecimal consumptionAmount;

    /**
     * 消费次数
     */
    private Integer consumptionCount;

    /**
     * 最后消费时间
     */
    private Date lastConsumptionTime;

    /**
     * 注册时间
     */
    private Date registerTime;

    /**
     * 注册来源
     */
    private String registerSource;

    /**
     * 状态(1:正常,0:冻结)
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