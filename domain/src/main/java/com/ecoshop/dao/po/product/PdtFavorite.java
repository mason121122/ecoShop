package com.ecoshop.dao.po.product;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品收藏表
 * @TableName pdt_favorite
 */
@Data
public class PdtFavorite implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 会员ID
     */
    private Long memberId;

    /**
     * 商品ID
     */
    private Long spuId;

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