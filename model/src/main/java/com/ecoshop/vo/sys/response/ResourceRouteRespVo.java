package com.ecoshop.vo.sys.response;


import lombok.Data;

import java.util.Date;

/**
 * 资源-路由关联表
 * @TableName sys_resource_route
 */
@Data
public class ResourceRouteRespVo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 资源ID
     */
    private Long resourceId;

    /**
     * 路由ID
     */
    private Long routeId;

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