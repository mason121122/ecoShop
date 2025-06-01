package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.OrganizationPo;
import com.ecoshop.dao.po.sys.RolePermissionPo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Vance
* @description 针对表【sys_organization(机构表)】的数据库操作Mapper
* @createDate 2025-05-28 15:11:26
* @Entity generator.ecoshop.OrganizationPo
*/
public interface OrganizationMapper {
    List<OrganizationPo> pageQuery(@Param("organizationPo")OrganizationPo organizationPo,
                                   @Param("offset") Integer offset,
                                   @Param("pageSize") Long pageSize);

    Integer pageCount(@Param("organizationPo")OrganizationPo organizationPo);

    Integer add(@Param("organizationPo")OrganizationPo organizationPo);

    Integer edit(@Param("organizationPo")OrganizationPo organizationPo);

    Integer del(@Param("id") Long id);

}




