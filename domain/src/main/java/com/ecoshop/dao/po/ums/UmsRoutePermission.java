package com.ecoshop.dao.po.ums;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 路由与权限关联表
 * @TableName ums_route_permission
 */
@Data
public class UmsRoutePermission implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 路由ID
     */
    private Long routeId;

    /**
     * 权限ID
     */
    private Long permissionId;

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