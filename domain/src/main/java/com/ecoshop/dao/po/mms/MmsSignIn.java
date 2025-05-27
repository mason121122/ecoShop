package com.ecoshop.dao.po.mms;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 会员签到表
 * @TableName mms_sign_in
 */
@Data
public class MmsSignIn implements Serializable {
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
     * 签到日期
     */
    private Date signDate;

    /**
     * 连续签到天数
     */
    private Integer continuousDays;

    /**
     * 获得积分
     */
    private Integer points;

    /**
     * 签到IP
     */
    private String ip;

    /**
     * 签到设备
     */
    private String device;

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

    private static final long serialVersionUID = 1L;
}