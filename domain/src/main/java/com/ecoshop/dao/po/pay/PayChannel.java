package com.ecoshop.dao.po.pay;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 支付渠道表
 * @TableName pay_channel
 */
@Data
public class PayChannel implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 渠道名称
     */
    private String name;

    /**
     * 渠道编码
     */
    private String code;

    /**
     * 商户号
     */
    private String merchantId;

    /**
     * 应用ID
     */
    private String appId;

    /**
     * 应用密钥
     */
    private String appSecret;

    /**
     * 公钥
     */
    private String publicKey;

    /**
     * 私钥
     */
    private String privateKey;

    /**
     * 回调地址
     */
    private String notifyUrl;

    /**
     * 返回地址
     */
    private String returnUrl;

    /**
     * 状态(1:正常,0:禁用)
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

    private static final long serialVersionUID = 1L;
}