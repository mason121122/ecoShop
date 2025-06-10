package com.ecoshop.service.sys.impl;

import com.ecoshop.common.utils.ClazzConverter;
import com.ecoshop.dao.mapper.sys.TenantMapper;
import com.ecoshop.dao.mapper.sys.UserMapper;
import com.ecoshop.dao.po.sys.TenantPo;
import com.ecoshop.dao.po.sys.UserPo;
import com.ecoshop.page.PageResponse;
import com.ecoshop.service.sys.IdentityService;
import com.ecoshop.vo.sys.request.OrganizationReqVo;
import com.ecoshop.vo.sys.request.TenantReqVo;
import com.ecoshop.vo.sys.request.UserReqVo;
import com.ecoshop.vo.sys.response.OrganizationRespVo;
import com.ecoshop.vo.sys.response.TenantRespVo;
import com.ecoshop.vo.sys.response.UserRespVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class IdentityServiceImpl implements IdentityService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private TenantMapper tenantMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    //===================================================用户管理=============================================================================================================
    @Override
    public boolean addUser(UserReqVo UserReqVo) {
        UserPo userPo = ClazzConverter.converterClass(UserReqVo, UserPo.class);
        long timestamp = System.currentTimeMillis();
        userPo.setTenantId(timestamp);
        //此处是系统管理员创建中台用户，并不是注册。默认密码123456
        String encodedPassword = passwordEncoder.encode("123456");
        userPo.setPassword(encodedPassword);
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
    public UserPo findByUserName(String userName) {
        return userMapper.findByUserName(userName);
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

    //===================================================租户管理=============================================================================================================
    @Override
    public boolean addTenant(TenantReqVo tenantReqVo) {
        return tenantMapper.add(ClazzConverter.converterClass(tenantReqVo, TenantPo.class)) > 0;
    }

    @Override
    public boolean editTenant(TenantReqVo tenantReqVo) {
        return tenantMapper.edit(ClazzConverter.converterClass(tenantReqVo, TenantPo.class)) > 0;
    }

    @Override
    public boolean delTenant(Long id) {
        return tenantMapper.delById(id) > 0;
    }

    @Override
    public PageResponse<TenantRespVo> pageQueryTenant(String name,
                                                      String code,
                                                      String contactName,
                                                      String contactPhone,
                                                      Date expireBeginTime,
                                                      Date expireEndTime,
                                                      Integer pageIndex,
                                                      Integer pageSize) {

        PageResponse<TenantRespVo> result = new PageResponse<>();
        result.setPageIndex(pageIndex);
        result.setList(ClazzConverter.converterClass(
                tenantMapper.pageQuery(name,code,contactName,contactPhone,expireBeginTime,expireEndTime,pageIndex,pageSize), TenantRespVo.class));
        result.setTotal(tenantMapper.findCount(name,code,contactName,contactPhone,expireBeginTime,expireEndTime));
        return result;
    }

    @Override
    public boolean addOrganization(OrganizationReqVo organizationBo) {
        return false;
    }

    @Override
    public boolean editOrganization(OrganizationReqVo organizationBo) {
        return false;
    }

    @Override
    public boolean delOrganization(OrganizationReqVo organizationBo) {
        return false;
    }

    @Override
    public PageResponse<OrganizationRespVo> pageQueryOrganization(OrganizationReqVo organizationReqVo) {
        return null;
    }
}
