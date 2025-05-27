package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.MenuPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 菜单表 Mapper 接口
 */
@Mapper
public interface MenuMapper {

    /**
     * 根据ID查询菜单
     *
     * @param id 菜单ID
     * @return 菜单信息
     */
    MenuPO selectById(@Param("id") Long id);

    /**
     * 查询菜单列表
     *
     * @param menu 查询条件
     * @return 菜单列表
     */
    List<MenuPO> selectList(MenuPO menu);

    /**
     * 根据父ID查询菜单列表
     *
     * @param parentId 父菜单ID
     * @return 菜单列表
     */
    List<MenuPO> selectListByParentId(@Param("parentId") Long parentId);

    /**
     * 根据用户ID查询菜单列表
     *
     * @param userId 用户ID
     * @return 菜单列表
     */
    List<MenuPO> selectListByUserId(@Param("userId") Long userId);

    /**
     * 根据角色ID查询菜单列表
     *
     * @param roleId 角色ID
     * @return 菜单列表
     */
    List<MenuPO> selectListByRoleId(@Param("roleId") Long roleId);

    /**
     * 新增菜单
     *
     * @param menu 菜单信息
     * @return 影响行数
     */
    int insert(MenuPO menu);

    /**
     * 修改菜单
     *
     * @param menu 菜单信息
     * @return 影响行数
     */
    int update(MenuPO menu);

    /**
     * 删除菜单
     *
     * @param id 菜单ID
     * @return 影响行数
     */
    int deleteById(@Param("id") Long id);
} 