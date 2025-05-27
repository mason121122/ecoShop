package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.RoleMenuPO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 角色菜单关联表 Mapper 接口
 */
public interface RoleMenuMapper {
    /**
     * 根据ID查询角色菜单关联
     */
    RoleMenuPO selectById(@Param("id") Long id);

    /**
     * 根据角色ID查询角色菜单关联列表
     */
    List<RoleMenuPO> selectListByRoleId(@Param("roleId") Long roleId);

    /**
     * 根据菜单ID查询角色菜单关联列表
     */
    List<RoleMenuPO> selectListByMenuId(@Param("menuId") Long menuId);

    /**
     * 新增角色菜单关联
     */
    int insert(RoleMenuPO roleMenu);

    /**
     * 批量新增角色菜单关联
     */
    int batchInsert(List<RoleMenuPO> roleMenuList);

    /**
     * 根据角色ID删除角色菜单关联
     */
    int deleteByRoleId(@Param("roleId") Long roleId);

    /**
     * 根据菜单ID删除角色菜单关联
     */
    int deleteByMenuId(@Param("menuId") Long menuId);

    /**
     * 删除角色菜单关联
     */
    int deleteById(@Param("id") Long id);
} 