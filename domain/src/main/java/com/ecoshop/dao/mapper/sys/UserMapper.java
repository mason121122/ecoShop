package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.UserPo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Vance
 * @description 针对表【sys_user(用户表)】的数据库操作Mapper
 * @createDate 2025-05-28 15:11:26
 * @Entity generator.ecoshop.UserPo
 */
public interface UserMapper {

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    UserPo findUserById(@Param("id") Long id);

    /**
     * 分页查询
     * @param userPo
     * @param offset
     * @param pageSize
     * @return
     */
    List<UserPo> findUserList(@Param("userPo") UserPo userPo, @Param("offset") Integer offset,
                         @Param("pageSize") Integer pageSize);

    Integer findUserCount(@Param("userPo") UserPo userPo);

    /**
     * 新增用户
     * @param userPo
     * @return
     */
    Integer addUser(@Param("userPo") UserPo userPo);

    /**
     * 编辑用户
     * @param userPo
     * @return
     */
    Integer editUser(@Param("userPo") UserPo userPo);

    /**
     * 删除单个用户
     * @param id
     * @return
     */
    Integer delUser(@Param("id") Long id);

    /**
     * 批量删除用户
     * @param ids
     * @return
     */
    Integer delUserBatch(@Param("ids") List<Long> ids);
}




