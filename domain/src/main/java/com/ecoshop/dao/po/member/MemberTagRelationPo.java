package com.ecoshop.dao.po.member;


import java.util.Date;
import lombok.Data;

/**
 * 会员与标签关联表
 * @TableName member_tag_relation
 */
@Data
public class MemberTagRelationPo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 会员ID
     */
    private Long memberId;

    /**
     * 标签ID
     */
    private Long tagId;

    /**
     * 打标类型(手动/自动)
     */
    private String type;

    /**
     * 操作人ID
     */
    private Long operatorId;

    /**
     * 操作人名称
     */
    private String operatorName;

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