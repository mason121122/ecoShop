package com.ecoshop.service.sys.impl;

import com.ecoshop.common.utils.ClazzConverter;
import com.ecoshop.dao.mapper.sys.UserMapper;
import com.ecoshop.dto.UserDetailsDto;
import com.ecoshop.service.sys.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserDetailsDto login(String username, String password) {
        return ClazzConverter.converterClass(userMapper.login(username,password),UserDetailsDto.class);
    }

}
