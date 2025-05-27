package com.ecoshop.dao.po.pdt;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 规格值表
 * @TableName pdt_spec_value
 */
@Data
public class PdtSpecValue implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 规格ID
     */
    private Long specId;

    /**
     * 规格值
     */
    private String value;

    /**
     * 排序号
     */
    private Integer sort;

    /**
     * 状态(1:启用,0:禁用)
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