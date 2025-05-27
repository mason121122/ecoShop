package com.ecoshop.dao.po.ums;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 权限表
 * @TableName ums_permission
 */
@Data
public class UmsPermission implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 权限编码
     */
    private String code;

    /**
     * 权限类型(菜单/按钮/接口/数据)
     */
    private String type;

    /**
     * 权限描述
     */
    private String description;

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