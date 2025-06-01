package com.ecoshop.dao.po.sys;


import java.util.Date;
import lombok.Data;

/**
 * 数据权限规则表
 * @TableName sys_data_rule
 */
@Data
public class DataRulePo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 规则名称
     */
    private String name;

    /**
     * 规则编码
     */
    private String code;

    /**
     * 规则描述
     */
    private String description;

    /**
     * 规则条件表达式
     */
    private String ruleCondition;

    /**
     * 状态(1:正常,0:禁用)
     */
    private Integer status;

    /**
     * 版本号(用于乐观锁)
     */
    private Integer version;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 修改时间(自动更新)
     */
    private Date updatedAt;

}