package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.UserPositionPo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Vance
* @description 针对表【sys_user_position(用户-机构-岗位关联表)】的数据库操作Mapper
* @createDate 2025-05-28 15:11:26
* @Entity generator.ecoshop.UserPositionPo
*/
public interface UserPositionMapper {

    /**
     * 条件查询
     * @param tenantId
     * @param userId
     * @param orgId
     * @param positionId
     * @return
     */
    List<UserPositionPo> find(@Param("tenantId") Long tenantId,@Param("userId") Long userId,
                              @Param("orgId") Long orgId,@Param("positionId") Long positionId);

    List<UserPositionPo> pageQuery(@Param("userPosition") UserPositionPo userPositionPo,
                                   @Param("offset") Integer offset,@Param("pageSize") Integer pageSize);

    Integer pageCount(@Param("userPosition") UserPositionPo userPositionPo);

    Integer add(@Param("userPosition") UserPositionPo userPositionPo);

    Integer edit(@Param("userPosition") UserPositionPo userPositionPo);

    Integer del(@Param("id") Long id);

}




