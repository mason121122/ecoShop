package com.ecoshop.vo.sys.request;


import lombok.Data;

import java.util.Date;

/**
 * 机构表
 * @TableName sys_organization
 */
@Data
public class OrganizationReqVo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 父机构ID
     */
    private Long parentId;

    /**
     * 机构名称
     */
    private String name;

    /**
     * 机构编码
     */
    private String code;

    /**
     * 机构类型(1:公司,2:部门,3:小组)
     */
    private Integer type;

    /**
     * 负责人ID
     */
    private Long leaderId;

    /**
     * 联系电话
     */
    private String contactPhone;

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