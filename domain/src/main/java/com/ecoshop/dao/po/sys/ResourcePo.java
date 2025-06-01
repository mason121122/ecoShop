package com.ecoshop.dao.po.sys;


import java.util.Date;
import lombok.Data;

/**
 * 资源表
 * @TableName sys_resource
 */
@Data
public class ResourcePo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 父资源ID
     */
    private Long parentId;

    /**
     * 资源名称
     */
    private String name;

    /**
     * 资源编码
     */
    private String code;

    /**
     * 资源类型(1:菜单,2:按钮,3:字段,4:API)
     */
    private Integer type;

    /**
     * URL路径
     */
    private String url;

    /**
     * 图标
     */
    private String icon;

    /**
     * 排序号
     */
    private Integer sort;

    /**
     * 是否可见(1:是,0:否)
     */
    private Integer visible;

    /**
     * 状态(1:正常,0:禁用)
     */
    private Integer status;

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