package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.RolePo;
import com.ecoshop.dao.po.sys.RoutePo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Vance
* @description 针对表【sys_route(路由表)】的数据库操作Mapper
* @createDate 2025-05-28 15:11:26
* @Entity generator.ecoshop.RoutePo
*/
public interface RouteMapper {

    List<RoutePo> find(@Param("tenantId") Long tenantId, @Param("roleId") Long roleId,
                       @Param("permissionId") Long permissionId);

    List<RoutePo> pageQuery(@Param("routePo")RoutePo routePo,@Param("offset") Integer offset,
                           @Param("pageSize") Long pageSize);

    Integer pageCount(@Param("routePo")RoutePo rolePo);

    Integer add(@Param("routePo")RoutePo rolePo);

    Integer edit(@Param("routePo")RoutePo rolePo);

    Integer del(@Param("id") Long id);

}




