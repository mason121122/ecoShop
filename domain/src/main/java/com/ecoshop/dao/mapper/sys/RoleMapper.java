package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.RolePO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 角色表 Mapper 接口
 */
@Mapper
public interface RoleMapper {

    /**
     * 根据ID查询角色
     *
     * @param id 角色ID
     * @return 角色信息
     */
    RolePO selectById(@Param("id") Long id);

    /**
     * 根据角色编码查询角色
     *
     * @param code 角色编码
     * @return 角色信息
     */
    RolePO selectByCode(@Param("code") String code);

    /**
     * 查询角色列表
     *
     * @param role 查询条件
     * @return 角色列表
     */
    List<RolePO> selectList(RolePO role);

    /**
     * 根据用户ID查询角色列表
     *
     * @param userId 用户ID
     * @return 角色列表
     */
    List<RolePO> selectListByUserId(@Param("userId") Long userId);

    /**
     * 新增角色
     *
     * @param role 角色信息
     * @return 影响行数
     */
    int insert(RolePO role);

    /**
     * 修改角色
     *
     * @param role 角色信息
     * @return 影响行数
     */
    int update(RolePO role);

    /**
     * 删除角色
     *
     * @param id 角色ID
     * @return 影响行数
     */
    int deleteById(@Param("id") Long id);
} 