package com.ecoshop.dao.po.product;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品与规格关联表
 * @TableName pdt_spu_spec
 */
@Data
public class PdtSpuSpec implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 商品ID
     */
    private Long spuId;

    /**
     * 规格ID
     */
    private Long specId;

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