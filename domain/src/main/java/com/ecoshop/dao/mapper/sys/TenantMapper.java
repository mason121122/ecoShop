package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.TenantPo;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

/**
* @author Vance
* @description 针对表【sys_tenant(租户表)】的数据库操作Mapper
* @createDate 2025-05-28 15:11:26
* @Entity generator.ecoshop.TenantPo
*/
public interface TenantMapper {

    /**
     * 根据id查询
     * @param id
     * @return
     */
//    TenantPo findById(@Param("id") Long id);

    /**
     * 多条件查询
     * @param tenantPo
     * @return
     */
    TenantPo pageQuery(@Param("tenantPo") TenantPo tenantPo, @Param("beginTime")Date beginTime,@Param("endTime")Date endTime);

    /**
     * 插入语句 - 全字段插入
     * @param tenantPo
     * @return
     */
    int add(@Param("tenantPo") TenantPo tenantPo);

    /**
     * 插入语句 - 动态字段
     * @param tenantPo
     * @return
     */
    int addSelective(@Param("tenantPo") TenantPo tenantPo);

    /**
     * 修改语句 - 全字段更新
     * @param tenantPo
     * @return
     */
    int editByPrimaryKey(@Param("tenantPo") TenantPo tenantPo);

    /**
     * 修改语句 - 动态更新
     * @param tenantPo
     * @return
     */
    int editBySelective(@Param("tenantPo") TenantPo tenantPo);

    /**
     * 删除语句 - 逻辑删除（更新状态）
     * @param id
     * @return
     */
    int delById(@Param("id") Long id);

    /**
     * 删除语句 - 物理删除（谨慎使用）
     * @param id
     * @return
     */
    int deleteByPrimaryKey(@Param("id") Long id);

}




