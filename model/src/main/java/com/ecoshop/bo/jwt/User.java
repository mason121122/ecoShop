package com.ecoshop.bo.jwt;

import lombok.Data;

import java.io.Serializable;

@Data

public class User implements Serializable {

    private static final long serialVersionUID = 1L;


    private Long id;
    
    private String username;
    
    private String password;
    
    private String email;
    
    private Integer status;
    
    private String roles; // 角色列表，以逗号分隔
}    