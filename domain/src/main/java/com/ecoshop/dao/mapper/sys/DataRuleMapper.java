package com.ecoshop.dao.mapper.sys;

import com.ecoshop.dao.po.sys.DataRulePo;
import com.ecoshop.dao.po.sys.OrganizationPo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Vance
* @description 针对表【sys_data_rule(数据权限规则表)】的数据库操作Mapper
* @createDate 2025-05-28 15:11:26
* @Entity generator.ecoshop.DataRulePo
*/
public interface DataRuleMapper {
    List<DataRulePo> pageQuery(@Param("dataRulePo")DataRulePo dataRulePo,
                               @Param("pageIndex") Integer pageIndex,
                               @Param("pageSize") Long pageSize);

    Integer pageCount(@Param("dataRulePo")DataRulePo dataRulePo);

    Integer add(@Param("dataRulePo")DataRulePo dataRulePo);

    Integer edit(@Param("dataRulePo")DataRulePo dataRulePo);

    Integer del(@Param("id") Long id);

}




