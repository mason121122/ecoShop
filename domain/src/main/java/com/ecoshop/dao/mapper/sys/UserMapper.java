package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.UserPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户表 Mapper 接口
 */
@Mapper
public interface UserMapper {

    /**
     * 根据ID查询用户
     *
     * @param id 用户ID
     * @return 用户信息
     */
    UserPO selectById(@Param("id") Long id);

    /**
     * 根据用户名查询用户
     *
     * @param username 用户名
     * @return 用户信息
     */
    UserPO selectByUsername(@Param("username") String username);

    /**
     * 根据手机号查询用户
     *
     * @param mobile 手机号
     * @return 用户信息
     */
    UserPO selectByMobile(@Param("mobile") String mobile);

    /**
     * 查询用户列表
     *
     * @param user 查询条件
     * @return 用户列表
     */
    List<UserPO> selectList(UserPO user);

    /**
     * 新增用户
     *
     * @param user 用户信息
     * @return 影响行数
     */
    int insert(UserPO user);

    /**
     * 修改用户
     *
     * @param user 用户信息
     * @return 影响行数
     */
    int update(UserPO user);

    /**
     * 删除用户
     *
     * @param id 用户ID
     * @return 影响行数
     */
    int deleteById(@Param("id") Long id);
} 