package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.RolePermissionPo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Vance
* @description 针对表【sys_role_permission(角色-权限关联表)】的数据库操作Mapper
* @createDate 2025-05-28 15:11:26
* @Entity generator.ecoshop.RolePermissionPo
*/
public interface RolePermissionMapper {

    List<RolePermissionPo> find(@Param("tenantId") Long tenantId,@Param("roleId") Long roleId,
                                @Param("permissionId") Long permissionId);

    List<RolePermissionPo> pageQuery(@Param("rolePermissionPo")RolePermissionPo rolePermissionPo,@Param("pageIndex") Integer pageIndex,
                                     @Param("pageSize") Long pageSize);

    Integer pageCount(@Param("rolePermissionPo")RolePermissionPo rolePermissionPo);

    Integer add(@Param("rolePermissionPo")RolePermissionPo rolePermissionPo);

    Integer edit(@Param("rolePermissionPo")RolePermissionPo rolePermissionPo);

    Integer del(@Param("id") Long id);
}




