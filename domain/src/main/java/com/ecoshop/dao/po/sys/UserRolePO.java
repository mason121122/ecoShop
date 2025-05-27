package com.ecoshop.dao.po.sys;

import lombok.Data;
import java.time.LocalDateTime;

/**
 * 用户角色关联表
 */
@Data
public class UserRolePO {
    
    /**
     * 主键ID
     */
    private Long id;
    
    /**
     * 用户ID
     */
    private Long userId;
    
    /**
     * 角色ID
     */
    private Long roleId;
    
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