package com.ecoshop.dao.po.sys;

import lombok.Data;
import java.time.LocalDateTime;

/**
 * 部门表
 */
@Data
public class DeptPO {
    
    /**
     * 主键ID
     */
    private Long id;
    
    /**
     * 租户ID
     */
    private Long tenantId;
    
    /**
     * 父部门ID
     */
    private Long parentId;
    
    /**
     * 部门名称
     */
    private String name;
    
    /**
     * 部门编码
     */
    private String code;
    
    /**
     * 负责人
     */
    private String leader;
    
    /**
     * 联系电话
     */
    private String phone;
    
    /**
     * 邮箱
     */
    private String email;
    
    /**
     * 排序号
     */
    private Integer sort;
    
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
    private LocalDateTime createdAt;
    
    /**
     * 修改时间
     */
    private LocalDateTime updatedAt;
} 