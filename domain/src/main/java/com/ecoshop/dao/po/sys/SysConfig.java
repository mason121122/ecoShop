package com.ecoshop.dao.po.sys;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 参数配置表
 * @TableName sys_config
 */
@Data
public class SysConfig implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 参数名称
     */
    private String name;

    /**
     * 参数编码
     */
    private String code;

    /**
     * 参数值
     */
    private String value;

    /**
     * 系统内置(1:是,0:否)
     */
    private Integer type;

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
    private Date createdAt;

    /**
     * 修改时间
     */
    private Date updatedAt;

    private static final long serialVersionUID = 1L;
}