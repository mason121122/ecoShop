package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.RolePermissionPo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Vance
* @description 针对表【sys_position_role(岗位-角色关联表)】的数据库操作Mapper
* @createDate 2025-05-28 15:11:26
* @Entity generator.ecoshop.PositionRolePo
*/
public interface PositionRoleMapper {

    List<RolePermissionPo> find(@Param("tenantId") Long tenantId, @Param("roleId") Long roleId,
                                @Param("permissionId") Long permissionId);

    Integer add(@Param("rolePermissionPo")RolePermissionPo rolePermissionPo);

    Integer edit(@Param("rolePermissionPo")RolePermissionPo rolePermissionPo);

    Integer del(@Param("id") Long id);

}




