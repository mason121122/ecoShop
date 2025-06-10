package com.ecoShop.security.service.impl;

import com.ecoShop.security.dto.UserDetailsDto;
import com.ecoShop.security.service.LoginService;
import com.ecoshop.common.utils.ClazzConverter;
import com.ecoshop.dao.mapper.sys.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
