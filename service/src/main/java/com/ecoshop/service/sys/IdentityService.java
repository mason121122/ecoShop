package com.ecoshop.service.sys;


import com.ecoshop.page.PageResponse;
import com.ecoshop.vo.sys.request.OrganizationReqVo;
import com.ecoshop.vo.sys.request.TenantReqVo;
import com.ecoshop.vo.sys.request.UserReqVo;
import com.ecoshop.vo.sys.response.OrganizationRespVo;
import com.ecoshop.vo.sys.response.TenantRespVo;
import com.ecoshop.vo.sys.response.UserRespVo;

import java.util.Date;

/**
 * Copyright 2025 Vance
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
public interface IdentityService {

    /**
     * 新增用户-中台
     *
     * @return
     */
    boolean addUser(UserReqVo UserReqVo);

    boolean editUser(UserReqVo UserReqVo);

    boolean delUser(Long id);

    /**
     * @param tenantId
     * @param username
     * @param realName
     * @param email
     * @param phone
     * @param status
     * @param pageIndex
     * @param pageSize
     * @return
     */
    PageResponse<UserRespVo> pageQuery(Long tenantId,
                                       String username,
                                       String realName,
                                       String email,
                                       String phone,
                                       Integer status,
                                       Integer pageIndex,
                                       Integer pageSize);

    /**
     * 新增租户
     *
     * @param tenantReqVo
     * @return
     */
    boolean addTenant(TenantReqVo tenantReqVo);

    boolean editTenant(TenantReqVo tenantReqVo);

    boolean delTenant(Long id);

    /**
     * 分页查询
     *
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
    PageResponse<TenantRespVo> pageQueryTenant(String name,
                                               String code,
                                               String contactName,
                                               String contactPhone,
                                               Date expireBeginTime,
                                               Date expireEndTime,
                                               Integer pageIndex,
                                               Integer pageSize);



    /**
     * 新增机构
     * @param organizationBo
     * @return
     */
    boolean addOrganization(OrganizationReqVo organizationBo);

    boolean editOrganization(OrganizationReqVo organizationBo);

    boolean delOrganization(OrganizationReqVo organizationBo);

    /**
     * 分页查询机构
     * @param organizationReqVo
     * @return
     */
    PageResponse<OrganizationRespVo> pageQueryOrganization(OrganizationReqVo organizationReqVo);

//    /**
//     * 新增岗位
//     * @param positionBo
//     * @return
//     */
//    boolean addPosition(PositionBo positionBo);
//
//    boolean editPosition(PositionBo positionBo);
//
//    boolean delPosition(PositionBo positionBo);
//
//    /**
//     * 分页查询岗位
//     * @param positionBo
//     * @param pageIndex
//     * @param pageSize
//     * @return
//     */
//    List<PositionBo> pageQueryPosition(PositionBo positionBo,Integer pageIndex,Integer pageSize);

//
//    /**
//     * 新增角色
//     * @param roleBo
//     * @return
//     */
//    boolean addRole(RoleBo roleBo);
//
//    boolean editRole(RoleBo roleBo);
//
//    boolean delRole(RoleBo roleBo);
//
//    /**
//     * 分页查询角色
//     * @param roleBo
//     * @param pageIndex
//     * @param pageSize
//     * @return
//     */
//    List<RoleBo> pageQueryRole(RoleBo roleBo,Integer pageIndex,Integer pageSize);

}
