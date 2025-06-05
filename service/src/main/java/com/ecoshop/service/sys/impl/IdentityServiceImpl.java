package com.ecoshop.service.sys.impl;

import com.ecoshop.common.utils.ClazzConverter;
import com.ecoshop.dao.mapper.sys.UserMapper;
import com.ecoshop.dao.po.sys.UserPo;
import com.ecoshop.page.PageResponse;
import com.ecoshop.service.sys.IdentityService;
import com.ecoshop.vo.sys.request.UserReqVo;
import com.ecoshop.vo.sys.response.UserRespVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class IdentityServiceImpl implements IdentityService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean addUser(UserReqVo UserReqVo) {
        UserPo userPo = ClazzConverter.converterClass(UserReqVo, UserPo.class);
        long timestamp = System.currentTimeMillis();
        userPo.setTenantId(timestamp);
        userPo.setPassword("123456");
        return userMapper.addUser(userPo) > 0;
    }

    @Override
    public boolean editUser(UserReqVo UserReqVo) {
        return userMapper.editUser(ClazzConverter.converterClass(UserReqVo, UserPo.class)) > 0;
    }

    @Override
    public boolean delUser(Long id) {
        return userMapper.delUser(id) > 0;
    }

    @Override
    public PageResponse<UserRespVo> pageQuery(Long tenantId,
                                              String username,
                                              String realName,
                                              String email,
                                              String phone,
                                              Integer status,
                                              Integer pageIndex,
                                              Integer pageSize) {
        PageResponse<UserRespVo> result = new PageResponse<>();
        result.setPageIndex(pageIndex);
        result.setTotal(userMapper.findUserCount(tenantId,username,realName,email,phone,status));
        result.setList(ClazzConverter.converterClass(userMapper.pageQuery(tenantId,username,realName,email,phone,status,pageIndex,pageSize), UserRespVo.class));
        return result;
    }
}
