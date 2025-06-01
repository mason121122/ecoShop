package com.ecoshop.bo.sys;


import lombok.Data;

import java.util.Date;

/**
 * 角色-数据规则关联表
 * @TableName sys_role_data_rule
 */
@Data
public class RoleDataRuleBo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 数据规则ID
     */
    private Long dataRuleId;

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