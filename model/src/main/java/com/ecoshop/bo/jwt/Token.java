package com.ecoshop.bo.jwt;

import lombok.Data;

import java.io.Serializable;

@Data
public class Token implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String accessToken;
    
    private String refreshToken;
    
    private Long expiresIn;
    
    private String tokenType;
}    