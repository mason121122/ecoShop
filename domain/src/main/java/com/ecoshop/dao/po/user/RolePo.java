package com.ecoshop.dao.po.user;

import lombok.Data;
import java.time.LocalDateTime;

/**
 * 角色实体类
 */
@Data
public class RolePO {
    /**
     * 主键ID
     */
    private Long id;
    
    /**
     * 租户ID
     */
    private Long tenantId;
    
    /**
     * 角色名称
     */
    private String name;
    
    /**
     * 角色编码
     */
    private String code;
    
    /**
     * 状态(1:正常,0:禁用)
     */
    private Integer status;
    
    /**
     * 数据范围(1:全部,2:自定义,3:本部门,4:本部门及以下,5:仅本人)
     */
    private Integer dataScope;
    
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
    private LocalDateTime createdAt;
    
    /**
     * 修改时间
     */
    private LocalDateTime updatedAt;
} 