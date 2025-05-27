package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.TenantPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 租户表 Mapper 接口
 */
@Mapper
public interface TenantMapper {

    /**
     * 根据ID查询租户
     *
     * @param id 租户ID
     * @return 租户信息
     */
    TenantPO selectById(@Param("id") Long id);

    /**
     * 根据租户编码查询租户
     *
     * @param code 租户编码
     * @return 租户信息
     */
    TenantPO selectByCode(@Param("code") String code);

    /**
     * 查询租户列表
     *
     * @param tenant 查询条件
     * @return 租户列表
     */
    List<TenantPO> selectList(TenantPO tenant);

    /**
     * 新增租户
     *
     * @param tenant 租户信息
     * @return 影响行数
     */
    int insert(TenantPO tenant);

    /**
     * 修改租户
     *
     * @param tenant 租户信息
     * @return 影响行数
     */
    int update(TenantPO tenant);

    /**
     * 删除租户
     *
     * @param id 租户ID
     * @return 影响行数
     */
    int deleteById(@Param("id") Long id);
} 