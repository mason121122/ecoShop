package com.ecoshop.dao.po.member;


import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 会员钱包表
 * @TableName member_wallet
 */
@Data
public class MemberWalletPo {
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
     * 余额
     */
    private BigDecimal balance;

    /**
     * 冻结余额
     */
    private BigDecimal freezeBalance;

    /**
     * 支付密码
     */
    private String password;

    /**
     * 状态(1:正常,0:冻结)
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

    
}