package com.ecoshop.dao.po.user;


import java.util.Date;
import lombok.Data;

/**
 * 路由表
 * @TableName route
 */
@Data
public class RoutePo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 路由路径
     */
    private String path;

    /**
     * 路由名称
     */
    private String name;

    /**
     * 前端组件
     */
    private String component;

    /**
     * 父级路由ID
     */
    private Long parentId;

    /**
     * 菜单图标
     */
    private String icon;

    /**
     * 排序号
     */
    private Integer orderNum;

    /**
     * 是否菜单(1:是,0:否)
     */
    private Integer isMenu;

    /**
     * 是否可见(1:可见,0:隐藏)
     */
    private Integer visible;

    /**
     * 状态(1:启用,0:禁用)
     */
    private Integer status;

    /**
     * 是否缓存(1:是,0:否)
     */
    private Integer keepAlive;

    /**
     * 外链地址
     */
    private String externalLink;

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

    
}