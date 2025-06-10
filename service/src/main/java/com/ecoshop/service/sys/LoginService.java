package com.ecoshop.service.sys;

import com.ecoshop.dto.UserDetailsDto;
import org.springframework.security.core.userdetails.UserDetails;

public interface LoginService {
    UserDetailsDto login(String username, String password);

}
