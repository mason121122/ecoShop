package com.ecoShop.security.service;

import com.ecoShop.security.dto.UserDetailsDto;
import org.springframework.security.core.userdetails.UserDetails;

public interface LoginService {
    UserDetailsDto login(String username, String password);

    void saveToken(String username,String token);

}
