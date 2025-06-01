package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.RolePermissionPo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Vance
* @description 针对表【sys_position(岗位表)】的数据库操作Mapper
* @createDate 2025-05-28 15:11:26
* @Entity generator.ecoshop.PositionPo
*/
public interface PositionMapper {
    List<RolePermissionPo> find(@Param("tenantId") Long tenantId);

    List<RolePermissionPo> pageQuery(@Param("rolePermissionPo")RolePermissionPo rolePermissionPo,@Param("offset") Integer offset,
                                     @Param("pageSize") Long pageSize);

    Integer pageCount(@Param("rolePermissionPo")RolePermissionPo rolePermissionPo);

    Integer add(@Param("rolePermissionPo")RolePermissionPo rolePermissionPo);

    Integer edit(@Param("rolePermissionPo")RolePermissionPo rolePermissionPo);

    Integer del(@Param("id") Long id);

}




