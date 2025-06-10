package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.RoleDataRulePo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Vance
* @description 针对表【sys_role_data_rule(角色-数据规则关联表)】的数据库操作Mapper
* @createDate 2025-05-28 15:11:26
* @Entity generator.ecoshop.RoleDataRulePo
*/
@Mapper
public interface RoleDataRuleMapper {

    List<RoleDataRulePo> find(@Param("tenantId") Long tenantId, @Param("roleId") Long roleId,
                              @Param("permissionId") Long permissionId);

    Integer add(@Param("roleDataRulePo")RoleDataRulePo roleDataRulePo);

    Integer edit(@Param("roleDataRulePo")RoleDataRulePo roleDataRulePo);

    Integer del(@Param("id") Long id);
}




