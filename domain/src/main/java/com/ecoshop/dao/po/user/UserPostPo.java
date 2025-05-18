package com.ecoshop.dao.po.user;


import java.util.Date;
import lombok.Data;

/**
 * 用户与岗位关联表
 * @TableName user_post
 */
@Data
public class UserPostPo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 岗位ID
     */
    private Long postId;

    /**
     * 分配人
     */
    private String assignedBy;

    /**
     * 分配时间
     */
    private Date assignedAt;

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