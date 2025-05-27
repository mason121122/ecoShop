package com.ecoshop.dao.po.ums;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 机构表
 * @TableName ums_org
 */
@Data
public class UmsOrg implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 机构名称
     */
    private String name;

    /**
     * 机构编码
     */
    private String code;

    /**
     * 机构类型（集团/分公司/部门）
     */
    private String type;

    /**
     * 上级机构ID
     */
    private Long parentId;

    /**
     * 负责人
     */
    private String leader;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 联系邮箱
     */
    private String email;

    /**
     * 机构地址
     */
    private String address;

    /**
     * 状态(1:启用,0:禁用)
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

    private static final long serialVersionUID = 1L;
}