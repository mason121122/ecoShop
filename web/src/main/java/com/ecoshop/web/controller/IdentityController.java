package com.ecoshop.web.controller;

import com.ecoshop.common.enums.ResultEnum;
import com.ecoshop.page.PageResponse;
import com.ecoshop.service.sys.IdentityService;
import com.ecoshop.support.ReturnResult;
import com.ecoshop.vo.sys.request.UserReqVo;
import com.ecoshop.vo.sys.response.UserRespVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api(tags = {"IdentityController"}, description = "身份管理")
@RestController
@RequestMapping("/users")
@Validated
public class IdentityController {

    @Autowired
    private IdentityService identityService;

    @ApiOperation(value = "创建中台用户", notes = "创建中台用户")
    @RequestMapping(value = "/addUser", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ReturnResult<?> addUser(@RequestBody @Valid UserReqVo UserReqVo){
        if(identityService.addUser(UserReqVo)){
            return new ReturnResult<>(ResultEnum.SUCCESS.getCode(),ResultEnum.SUCCESS.getDesc());
        }else{
            return new ReturnResult<>(ResultEnum.ADD_FAIL.getCode(),ResultEnum.ADD_FAIL.getDesc());
        }
    }

    @ApiOperation(value = "编辑中台用户", notes = "编辑中台用户")
    @RequestMapping(value = "/editUser", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ReturnResult<?> editUser(@RequestBody @Valid UserReqVo UserReqVo){
        if(identityService.editUser(UserReqVo)){
            return new ReturnResult<>(ResultEnum.SUCCESS.getCode(),ResultEnum.SUCCESS.getDesc());
        }else {
            return new ReturnResult<>(ResultEnum.SYS_ERROR.getCode(),ResultEnum.SYS_ERROR.getDesc());
        }
    }

    @ApiOperation(value = "删除", notes = "删除")
    @RequestMapping(value = "/delUser", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ReturnResult<?> delUser(@ApiParam(value = "用户id", required = true) @RequestParam(value = "id", required = false) Long id){
        if(identityService.delUser(id)){
            return new ReturnResult<>(ResultEnum.SUCCESS.getCode(),ResultEnum.SUCCESS.getDesc());
        }else {
            return new ReturnResult<>(ResultEnum.NOT_FOUND.getCode(),ResultEnum.NOT_FOUND.getDesc());
        }
    }
    @ApiOperation(value = "分页查询用户", notes = "分页查询用户")
    @RequestMapping(value = "/pageQuery", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ReturnResult<PageResponse<UserRespVo>> pageQuery(@ApiParam(value = "用户名", required = false) @RequestParam(value = "username", required = false) String username,
                                                            @ApiParam(value = "手机号", required = false) @RequestParam(value = "phone", required = false) String phone,
                                                            @ApiParam(value = "当前页码", required = true) @RequestParam(value = "pageIndex", required = true) Integer pageIndex,
                                                            @ApiParam(value = "每页显示数量", required = true) @RequestParam(value = "pageSize", required = true) Integer pageSize){
        if (pageIndex == 0) {
            pageIndex = 1;
        }
        pageIndex = (pageIndex - 1) * pageSize;
        return new ReturnResult<>(ResultEnum.SUCCESS.getCode(),ResultEnum.SUCCESS.getDesc(),
                identityService.pageQuery(null,username,null,null,phone,null,pageIndex,pageSize));
    }

}
