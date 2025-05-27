package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.UserRolePO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户角色关联表 Mapper 接口
 */
@Mapper
public interface UserRoleMapper {

    /**
     * 根据ID查询用户角色关联
     *
     * @param id 主键ID
     * @return 用户角色关联信息
     */
    UserRolePO selectById(@Param("id") Long id);

    /**
     * 根据用户ID查询用户角色关联列表
     *
     * @param userId 用户ID
     * @return 用户角色关联列表
     */
    List<UserRolePO> selectListByUserId(@Param("userId") Long userId);

    /**
     * 根据角色ID查询用户角色关联列表
     *
     * @param roleId 角色ID
     * @return 用户角色关联列表
     */
    List<UserRolePO> selectListByRoleId(@Param("roleId") Long roleId);

    /**
     * 新增用户角色关联
     *
     * @param userRole 用户角色关联信息
     * @return 影响行数
     */
    int insert(UserRolePO userRole);

    /**
     * 批量新增用户角色关联
     *
     * @param userRoleList 用户角色关联列表
     * @return 影响行数
     */
    int batchInsert(List<UserRolePO> userRoleList);

    /**
     * 根据用户ID删除用户角色关联
     *
     * @param userId 用户ID
     * @return 影响行数
     */
    int deleteByUserId(@Param("userId") Long userId);

    /**
     * 根据角色ID删除用户角色关联
     *
     * @param roleId 角色ID
     * @return 影响行数
     */
    int deleteByRoleId(@Param("roleId") Long roleId);

    /**
     * 删除用户角色关联
     *
     * @param id 主键ID
     * @return 影响行数
     */
    int deleteById(@Param("id") Long id);
} 