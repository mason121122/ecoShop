package com.ecoshop.dto;

import com.ecoshop.bo.sys.ResourceBo;
import com.ecoshop.bo.sys.UserBo;
import lombok.Data;

@Data
public class UserDetailsDto {
    private UserBo userBo;
    private ResourceBo resourceBo;

}
