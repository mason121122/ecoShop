package com.ecoshop.dao.po.pdt;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 规格表
 * @TableName pdt_spec
 */
@Data
public class PdtSpec implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 规格名称
     */
    private String name;

    /**
     * 规格编码
     */
    private String code;

    /**
     * 所属分类ID
     */
    private Long categoryId;

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