package com.ecoShop.security.service.impl;

import com.ecoShop.security.dto.UserDetailsDto;
import com.ecoshop.common.utils.ClazzConverter;
import com.ecoshop.dao.mapper.sys.UserMapper;
import com.ecoshop.dao.po.sys.UserPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username){
        UserPo userPo = userMapper.findByUserName(username);
        UserDetailsDto userDetailsDto = ClazzConverter.converterClass(userPo, UserDetailsDto.class);
        if(null == userDetailsDto){
            throw new UsernameNotFoundException("用户不存在");
        }
        return userDetailsDto;
    }


}
