package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.TenantPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


/**
* @author Vance
* @description 针对表【sys_tenant(租户表)】的数据库操作Mapper
* @createDate 2025-05-28 15:11:26
* @Entity generator.ecoshop.TenantPo
*/
@Mapper
@Repository
public interface TenantMapper {

    /**
     * 根据id查询
     * @param id
     * @return
     */
//    TenantPo findById(@Param("id") Long id);

    /**
     * 多条件查询
     * @param name
     * @param code
     * @param contactName
     * @param contactPhone
     * @param expireBeginTime
     * @param expireEndTime
     * @param pageIndex
     * @param pageSize
     * @return
     */
    List<TenantPo> pageQuery(@Param("id") String name,
                             @Param("id") String code,
                             @Param("id") String contactName,
                             @Param("id") String contactPhone,
                             @Param("id") Date expireBeginTime,
                             @Param("id") Date expireEndTime,
                             @Param("id") Integer pageIndex,
                             @Param("id") Integer pageSize);

    Integer findCount(@Param("id") String name,
                             @Param("id") String code,
                             @Param("id") String contactName,
                             @Param("id") String contactPhone,
                             @Param("id") Date expireBeginTime,
                             @Param("id") Date expireEndTime);
    /**
     * 插入语句 - 全字段插入
     * @param tenantPo
     * @return
     */
    int add(@Param("tenantPo") TenantPo tenantPo);


    /**
     * 修改语句 - 动态更新
     * @param tenantPo
     * @return
     */
    int edit(@Param("tenantPo") TenantPo tenantPo);

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




