package com.ecoshop.dao.po.product;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品分类表
 * @TableName pdt_category
 */
@Data
public class PdtCategory implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 分类编码
     */
    private String code;

    /**
     * 父分类ID
     */
    private Long parentId;

    /**
     * 分类级别
     */
    private Integer level;

    /**
     * 分类路径
     */
    private String path;

    /**
     * 分类图标
     */
    private String icon;

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