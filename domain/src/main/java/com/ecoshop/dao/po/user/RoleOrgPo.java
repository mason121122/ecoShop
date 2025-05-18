package com.ecoshop.dao.po.user;


import java.util.Date;
import lombok.Data;

/**
 * 角色与机构关联表
 * @TableName role_org
 */
@Data
public class RoleOrgPo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 机构ID
     */
    private Long orgId;

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