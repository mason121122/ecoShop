package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.DeptPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 部门表 Mapper 接口
 */
@Mapper
public interface DeptMapper {

    /**
     * 根据ID查询部门
     *
     * @param id 部门ID
     * @return 部门信息
     */
    DeptPO selectById(@Param("id") Long id);

    /**
     * 根据部门编码查询部门
     *
     * @param code 部门编码
     * @return 部门信息
     */
    DeptPO selectByCode(@Param("code") String code);

    /**
     * 查询部门列表
     *
     * @param dept 查询条件
     * @return 部门列表
     */
    List<DeptPO> selectList(DeptPO dept);

    /**
     * 根据父ID查询部门列表
     *
     * @param parentId 父部门ID
     * @return 部门列表
     */
    List<DeptPO> selectListByParentId(@Param("parentId") Long parentId);

    /**
     * 根据角色ID查询部门列表
     *
     * @param roleId 角色ID
     * @return 部门列表
     */
    List<DeptPO> selectListByRoleId(@Param("roleId") Long roleId);

    /**
     * 新增部门
     *
     * @param dept 部门信息
     * @return 影响行数
     */
    int insert(DeptPO dept);

    /**
     * 修改部门
     *
     * @param dept 部门信息
     * @return 影响行数
     */
    int update(DeptPO dept);

    /**
     * 删除部门
     *
     * @param id 部门ID
     * @return 影响行数
     */
    int deleteById(@Param("id") Long id);
} 