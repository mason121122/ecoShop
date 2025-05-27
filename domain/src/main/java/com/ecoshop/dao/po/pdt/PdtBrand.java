package com.ecoshop.dao.po.pdt;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 品牌表
 * @TableName pdt_brand
 */
@Data
public class PdtBrand implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 品牌名称
     */
    private String name;

    /**
     * 品牌logo
     */
    private String logo;

    /**
     * 品牌描述
     */
    private String description;

    /**
     * 品牌官网
     */
    private String website;

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