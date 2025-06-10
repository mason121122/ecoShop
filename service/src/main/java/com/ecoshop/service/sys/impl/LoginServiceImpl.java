package com.ecoshop.service.sys.impl;

import com.ecoshop.bo.sys.UserBo;
import com.ecoshop.common.utils.ClazzConverter;
import com.ecoshop.dao.mapper.sys.UserMapper;
import com.ecoshop.dto.UserDetailsDto;
import com.ecoshop.service.sys.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetailsDto login(String username, String password) {
        UserDetailsDto loginDto = new UserDetailsDto();
        loginDto.setUserBo(ClazzConverter.converterClass(userMapper.login(username,password),UserBo.class));
        return loginDto;
    }


}
