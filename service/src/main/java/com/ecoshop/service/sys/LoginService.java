package com.ecoshop.service.sys;

import com.ecoshop.dto.UserDetailsDto;

public interface LoginService {
    UserDetailsDto login(String username, String password);
}
