package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.RoleDeptPO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 角色部门关联表 Mapper 接口
 */
public interface RoleDeptMapper {
    /**
     * 根据ID查询角色部门关联
     */
    RoleDeptPO selectById(@Param("id") Long id);

    /**
     * 根据角色ID查询角色部门关联列表
     */
    List<RoleDeptPO> selectListByRoleId(@Param("roleId") Long roleId);

    /**
     * 根据部门ID查询角色部门关联列表
     */
    List<RoleDeptPO> selectListByDeptId(@Param("deptId") Long deptId);

    /**
     * 新增角色部门关联
     */
    int insert(RoleDeptPO roleDept);

    /**
     * 批量新增角色部门关联
     */
    int batchInsert(List<RoleDeptPO> roleDeptList);

    /**
     * 根据角色ID删除角色部门关联
     */
    int deleteByRoleId(@Param("roleId") Long roleId);

    /**
     * 根据部门ID删除角色部门关联
     */
    int deleteByDeptId(@Param("deptId") Long deptId);

    /**
     * 删除角色部门关联
     */
    int deleteById(@Param("id") Long id);
} 