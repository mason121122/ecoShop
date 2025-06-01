package com.ecoshop.service.sys;

import org.springframework.stereotype.Service;

/**
 * Copyright 2025 Vance
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
@Service
public interface MappingService {

    /**
     * 租户-用户-机构-岗位
     * @param tenantId
     * @param userId
     * @param orgId
     * @param positionId
     * @return
     */
    boolean addUserPositionMapping(Long tenantId,Long userId,Long orgId,Long positionId);

    boolean editUserPositionMapping(Long tenantId,Long userId,Long orgId,Long positionId);

    boolean delUserPositionMapping(Long tenantId,Long userId,Long orgId,Long positionId);

    /**
     * 角色-权限关联
     * @param tenantId 租户id
     * @param roleId 角色id
     * @param permissionId 权限id
     * @return
     */
    boolean addPositionRole(Long tenantId,Long roleId,Long permissionId);

    boolean editPositionRole(Long tenantId,Long roleId,Long permissionId);

    boolean delPositionRole(Long tenantId,Long roleId,Long permissionId);

    /**
     * 资源-路由关联
     * @param tenantId 租户id
     * @param resourceId 资源id
     * @param routeId 路由id
     * @return
     */
    boolean addResourceRoute(Long tenantId,Long resourceId,Long routeId);

    boolean editResourceRoute(Long tenantId,Long resourceId,Long routeId);

    boolean delResourceRoute(Long tenantId,Long resourceId,Long routeId);

    /**
     * 角色-数据规则关联
     * @param tenantId 租户id
     * @param roleId 角色id
     * @param dataRuleId 数据规则id
     * @return
     */
    boolean addRoleDataRule(Long tenantId,Long roleId,Long dataRuleId);

    boolean editRoleDataRule(Long tenantId,Long roleId,Long dataRuleId);

    boolean delRoleDataRule(Long tenantId,Long roleId,Long dataRuleId);



}
