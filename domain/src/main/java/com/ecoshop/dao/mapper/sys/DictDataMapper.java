package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.DictDataPO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 字典数据表 Mapper 接口
 */
public interface DictDataMapper {
    /**
     * 根据ID查询字典数据
     */
    DictDataPO selectById(@Param("id") Long id);

    /**
     * 根据字典类型查询字典数据列表
     */
    List<DictDataPO> selectListByDictType(@Param("dictType") String dictType);

    /**
     * 查询字典数据列表
     */
    List<DictDataPO> selectList(DictDataPO dictData);

    /**
     * 新增字典数据
     */
    int insert(DictDataPO dictData);

    /**
     * 修改字典数据
     */
    int update(DictDataPO dictData);

    /**
     * 删除字典数据
     */
    int deleteById(@Param("id") Long id);

    /**
     * 批量删除字典数据
     */
    int deleteBatchIds(@Param("ids") List<Long> ids);

    /**
     * 根据字典类型删除字典数据
     */
    int deleteByDictType(@Param("dictType") String dictType);
} 