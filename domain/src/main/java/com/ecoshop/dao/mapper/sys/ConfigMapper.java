package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.ConfigPO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 参数配置表 Mapper 接口
 */
public interface ConfigMapper {
    /**
     * 根据ID查询参数配置
     */
    ConfigPO selectById(@Param("id") Long id);

    /**
     * 根据参数键名查询参数配置
     */
    ConfigPO selectByConfigKey(@Param("configKey") String configKey);

    /**
     * 查询参数配置列表
     */
    List<ConfigPO> selectList(ConfigPO config);

    /**
     * 新增参数配置
     */
    int insert(ConfigPO config);

    /**
     * 修改参数配置
     */
    int update(ConfigPO config);

    /**
     * 删除参数配置
     */
    int deleteById(@Param("id") Long id);

    /**
     * 批量删除参数配置
     */
    int deleteBatchIds(@Param("ids") List<Long> ids);

    /**
     * 根据参数键名删除参数配置
     */
    int deleteByConfigKey(@Param("configKey") String configKey);
} 