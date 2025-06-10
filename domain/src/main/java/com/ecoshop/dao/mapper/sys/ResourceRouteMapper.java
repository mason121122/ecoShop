package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.ResourceRoutePo;
import com.ecoshop.dao.po.sys.RoleDataRulePo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Vance
* @description 针对表【sys_resource_route(资源-路由关联表)】的数据库操作Mapper
* @createDate 2025-05-28 15:11:26
* @Entity generator.ecoshop.ResourceRoutePo
*/
@Mapper
public interface ResourceRouteMapper {
    List<ResourceRoutePo> find(@Param("tenantId") Long tenantId, @Param("roleId") Long roleId,
                               @Param("permissionId") Long permissionId);

    Integer add(@Param("resourceRoutePo")ResourceRoutePo resourceRoutePo);

    Integer edit(@Param("resourceRoutePo")ResourceRoutePo resourceRoutePo);

    Integer del(@Param("id") Long id);

}




