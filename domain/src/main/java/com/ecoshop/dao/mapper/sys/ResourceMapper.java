package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.ResourcePo;
import com.ecoshop.dao.po.sys.RolePermissionPo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Vance
* @description 针对表【sys_resource(资源表)】的数据库操作Mapper
* @createDate 2025-05-28 15:11:26
* @Entity generator.ecoshop.ResourcePo
*/
public interface ResourceMapper {
    List<ResourcePo> find(@Param("tenantId") Long tenantId, @Param("roleId") Long roleId,
                          @Param("permissionId") Long permissionId);

    List<ResourcePo> pageQuery(@Param("resourcePo")ResourcePo resourcePo,@Param("pageIndex") Integer pageIndex,
                                     @Param("pageSize") Long pageSize);

    Integer pageCount(@Param("resourcePo")ResourcePo resourcePo);

    Integer add(@Param("resourcePo")ResourcePo resourcePo);

    Integer edit(@Param("resourcePo")ResourcePo resourcePo);

    Integer del(@Param("id") Long id);
}




