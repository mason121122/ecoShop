package com.ecoShop.security.service.impl;

import com.ecoShop.security.dto.UserDetailsDto;
import com.ecoShop.security.service.LoginService;
import com.ecoshop.common.utils.ClazzConverter;
import com.ecoshop.dao.mapper.sys.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public UserDetailsDto login(String username, String password) {
        return ClazzConverter.converterClass(userMapper.login(username,password),UserDetailsDto.class);
    }


    public void saveToken(String username,String token) {
        // 构建Redis key
        String key = "token:" + username;
        // 保存用户对象到Redis，设置过期时间为1小时
        redisTemplate.opsForValue().set(key, token, 1, TimeUnit.HOURS);
    }

}
