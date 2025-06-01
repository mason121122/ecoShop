package com.ecoshop.bo.sys;


import lombok.Data;

import java.util.Date;

/**
 * 岗位表
 * @TableName sys_position
 */
@Data
public class PositionBo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 所属机构ID
     */
    private Long orgId;

    /**
     * 岗位名称
     */
    private String name;

    /**
     * 岗位编码
     */
    private String code;

    /**
     * 岗位层级
     */
    private Integer level;

    /**
     * 岗位描述
     */
    private String description;

    /**
     * 状态(1:正常,0:禁用)
     */
    private Integer status;

    /**
     * 排序号
     */
    private Integer sort;

    /**
     * 备注
     */
    private String remark;

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