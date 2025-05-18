package com.ecoshop.dao.po.member;


import java.util.Date;
import lombok.Data;

/**
 * 会员标签表
 * @TableName member_tag
 */
@Data
public class MemberTagPo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 标签名称
     */
    private String name;

    /**
     * 标签编码
     */
    private String code;

    /**
     * 标签描述
     */
    private String description;

    /**
     * 标签类型(手动/自动)
     */
    private String type;

    /**
     * 自动打标签规则(JSON格式)
     */
    private String rule;

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