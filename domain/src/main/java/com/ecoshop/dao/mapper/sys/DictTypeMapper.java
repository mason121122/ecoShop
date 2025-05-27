package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.DictTypePO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 字典类型表 Mapper 接口
 */
public interface DictTypeMapper {
    /**
     * 根据ID查询字典类型
     */
    DictTypePO selectById(@Param("id") Long id);

    /**
     * 根据字典类型查询
     */
    DictTypePO selectByType(@Param("type") String type);

    /**
     * 查询字典类型列表
     */
    List<DictTypePO> selectList(DictTypePO dictType);

    /**
     * 新增字典类型
     */
    int insert(DictTypePO dictType);

    /**
     * 修改字典类型
     */
    int update(DictTypePO dictType);

    /**
     * 删除字典类型
     */
    int deleteById(@Param("id") Long id);

    /**
     * 批量删除字典类型
     */
    int deleteBatchIds(@Param("ids") List<Long> ids);
} 