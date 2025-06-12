package com.ecoShop.security.web;

import com.ecoShop.security.dto.PermissionRequest;
import com.ecoShop.security.dto.PermissionResponse;
import com.ecoShop.security.service.LoginService;
import com.ecoShop.security.utils.JwtUtil;
import com.ecoshop.common.enums.ResultEnum;
import com.ecoshop.support.ReturnResult;
import com.ecoshop.vo.sys.request.UserReqVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(tags = {"AuthController"}, description = "认证管理")
@RestController
@RequestMapping("/security")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private LoginService loginService;

    @ApiOperation(value = "登入", notes = "登入")
    @GetMapping("/login")
    public ReturnResult<?> login(@ApiParam(value = "用户名", required = true) @RequestParam(value = "name", required = true) String name,
                                 @ApiParam(value = "密码", required = true) @RequestParam(value = "password", required = true) String password) {
        try {
            // 1. 验证用户名和密码
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            name,
                            password
                    )
            );
        } catch (BadCredentialsException e) {
            return new ReturnResult<>(ResultEnum.LOGIN_ERR.getCode(), ResultEnum.LOGIN_ERR.getDesc());
        }

        // 2. 加载用户信息
        final UserDetails userDetails = userDetailsService.loadUserByUsername(name);

        // 3. 生成 JWT Token
        final String jwt = jwtUtil.generateToken(userDetails);
        loginService.saveToken(userDetails.getUsername(),jwt);
        return new ReturnResult<>(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getDesc(), jwt);
    }

    @ApiOperation(value = "登入", notes = "登入")
    @PostMapping("/loginpost")
    public ReturnResult<?> loginpost(@RequestBody UserReqVo userReqVo) {
        try {
            // 1. 验证用户名和密码
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            userReqVo.getUsername(),
                            userReqVo.getPassword()
                    )
            );
        } catch (BadCredentialsException e) {
            return new ReturnResult<>(ResultEnum.LOGIN_ERR.getCode(), ResultEnum.LOGIN_ERR.getDesc());
        }

        // 2. 加载用户信息
        UserDetails userDetails = userDetailsService.loadUserByUsername(userReqVo.getUsername());

        // 3. 生成 JWT Token
        String jwt = jwtUtil.generateToken(userDetails);
        loginService.saveToken(userDetails.getUsername(),jwt);
        return new ReturnResult<>(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getDesc(), jwt);
    }


    @GetMapping("/verify-permission/{token}/{url}")
    public ReturnResult<?> verifyPermission(@ApiParam(value = "token", required = false) @RequestParam(value = "token", required = false) String token,
                                            @ApiParam(value = "url", required = false) @RequestParam(value = "url", required = false) String url) {
        try {
            // 解析JWT令牌
            Map<String, Object> claims = jwtUtil.validateToken(token);

            Map<String,Object> map = new HashMap<>();

            String userId = (String) claims.get("sub");
            String[] roles = ((String) claims.get("roles")).split(",");
            String[] permissions = ((String) claims.get("permissions")).split(",");
            map.put("userId",userId);

            return new ReturnResult<>(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getDesc(), map);
        } catch (Exception e) {
            return new ReturnResult<>(ResultEnum.LOGIN_ERR.getCode(), ResultEnum.LOGIN_ERR.getDesc());
        }
    }
}
