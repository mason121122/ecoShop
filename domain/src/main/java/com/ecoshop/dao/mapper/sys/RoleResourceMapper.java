package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.RoleResourcePo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Vance
* @description 针对表【sys_role_permission(角色-权限关联表)】的数据库操作Mapper
* @createDate 2025-05-28 15:11:26
* @Entity generator.ecoshop.RolePermissionPo
*/
@Mapper
public interface RoleResourceMapper {

    List<RoleResourcePo> find(@Param("tenantId") Long tenantId, @Param("roleId") Long roleId,
                              @Param("resourceId") Long resourceId);

    List<RoleResourcePo> pageQuery(@Param("roleResourcePo") RoleResourcePo roleResourcePo, @Param("pageIndex") Integer pageIndex,
                                   @Param("pageSize") Long pageSize);

    Integer pageCount(@Param("roleResourcePo") RoleResourcePo roleResourcePo);

    Integer add(@Param("roleResourcePo") RoleResourcePo roleResourcePo);

    Integer edit(@Param("roleResourcePo") RoleResourcePo roleResourcePo);

    Integer del(@Param("id") Long id);
}




