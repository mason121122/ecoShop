package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.OperLogPO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 操作日志记录表 Mapper 接口
 */
public interface OperLogMapper {
    /**
     * 根据ID查询操作日志
     */
    OperLogPO selectById(@Param("id") Long id);

    /**
     * 查询操作日志列表
     */
    List<OperLogPO> selectList(OperLogPO operLog);

    /**
     * 新增操作日志
     */
    int insert(OperLogPO operLog);

    /**
     * 修改操作日志
     */
    int update(OperLogPO operLog);

    /**
     * 删除操作日志
     */
    int deleteById(@Param("id") Long id);

    /**
     * 批量删除操作日志
     */
    int deleteBatchIds(@Param("ids") List<Long> ids);

    /**
     * 清空操作日志
     */
    int cleanOperLog();
} 