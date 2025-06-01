package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.RolePermissionPo;
import com.ecoshop.dao.po.sys.RolePo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Vance
* @description 针对表【sys_role(角色表)】的数据库操作Mapper
* @createDate 2025-05-28 15:11:26
* @Entity generator.ecoshop.RolePo
*/
public interface RoleMapper {
    List<RolePo> find(@Param("tenantId") Long tenantId, @Param("roleId") Long roleId,
                      @Param("permissionId") Long permissionId);

    List<RolePo> pageQuery(@Param("rolePo")RolePo rolePo,@Param("offset") Integer offset,
                                     @Param("pageSize") Long pageSize);

    Integer pageCount(@Param("rolePo")RolePo rolePo);

    Integer add(@Param("rolePo")RolePo rolePo);

    Integer edit(@Param("rolePo")RolePo rolePo);

    Integer del(@Param("id") Long id);

}




