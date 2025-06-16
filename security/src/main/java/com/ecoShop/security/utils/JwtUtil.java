package com.ecoShop.security.utils;

import com.alibaba.fastjson2.JSON;
import com.ecoShop.security.dto.UserDetailsDto;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Component
public class JwtUtil {

    private static final String SECRET_KEY = "yourSecretKey";
    private static final long EXPIRATION_TIME = 1000 * 60 * 60; // 1小时

    // 生成JWT Token
    public String generateToken(UserDetailsDto userDetails) {
        Map<String, Object> claims = new HashMap<>();
        return createToken(claims, userDetails);
    }

    private String createToken(Map<String, Object> claims, UserDetailsDto userDetails) {
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(JSON.toJSONString(userDetails))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }

    // 验证Token
    public Boolean validateToken(String token, UserDetailsDto userDetails) throws ExpiredJwtException, MalformedJwtException, SignatureException, UnsupportedJwtException {
        try {
            String username = extractUsername(token);
            return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
        } catch (ExpiredJwtException | MalformedJwtException | SignatureException | UnsupportedJwtException e) {
            throw e;
        }
    }

    public Claims validateToken(String token) throws ExpiredJwtException, MalformedJwtException, SignatureException, UnsupportedJwtException {
        try {
            Claims claims = extractAllClaims(token);
            claims.getSubject();
            return claims;
        } catch (ExpiredJwtException | MalformedJwtException | SignatureException | UnsupportedJwtException e) {
            throw e;
        }
    }

    // 提取用户名
    public String extractUsername(String token) throws ExpiredJwtException, MalformedJwtException, SignatureException, UnsupportedJwtException {
        try {
            return extractClaim(token, Claims::getSubject);
        } catch (ExpiredJwtException | MalformedJwtException | SignatureException | UnsupportedJwtException e) {
            throw e;
        }
    }

    // 提取过期时间
    public Date extractExpiration(String token) throws ExpiredJwtException, MalformedJwtException, SignatureException, UnsupportedJwtException {
        try {
            return extractClaim(token, Claims::getExpiration);
        } catch (ExpiredJwtException | MalformedJwtException | SignatureException | UnsupportedJwtException e) {
            throw e;
        }
    }

    private <T> T extractClaim(String token, Function<Claims, T> claimsResolver) throws ExpiredJwtException, MalformedJwtException, SignatureException, UnsupportedJwtException {
        Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    private Claims extractAllClaims(String token) throws ExpiredJwtException, MalformedJwtException, SignatureException, UnsupportedJwtException {
        try {
            return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
        } catch (ExpiredJwtException | MalformedJwtException | SignatureException | UnsupportedJwtException e) {
            throw e;
        }
    }

    private Boolean isTokenExpired(String token) throws ExpiredJwtException, MalformedJwtException, SignatureException, UnsupportedJwtException {
        return extractExpiration(token).before(new Date());
    }
}