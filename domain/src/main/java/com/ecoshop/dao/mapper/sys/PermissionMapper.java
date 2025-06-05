package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.PermissionPo;
import com.ecoshop.dao.po.sys.RolePermissionPo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Vance
* @description 针对表【sys_permission(权限表)】的数据库操作Mapper
* @createDate 2025-05-28 15:11:26
* @Entity generator.ecoshop.PermissionPo
*/
public interface PermissionMapper {

    List<PermissionPo> pageQuery(@Param("permissionPo")PermissionPo permissionPo,
                                 @Param("pageIndex") Integer pageIndex,
                                 @Param("pageSize") Long pageSize);

    Integer pageCount(@Param("permissionPo")PermissionPo permissionPo);

    Integer add(@Param("permissionPo")PermissionPo permissionPo);

    Integer edit(@Param("permissionPo")PermissionPo permissionPo);

    Integer del(@Param("id") Long id);
}




