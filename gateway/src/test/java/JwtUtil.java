import com.alibaba.fastjson2.JSON;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
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
    public static String generateToken(Map<String,Object> map) {
        Map<String, Object> claims = new HashMap<>();
        return createToken(claims, map);
    }

    private static String createToken(Map<String, Object> claims, Map<String,Object> map) {
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(JSON.toJSONString(map))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }

    // 验证Token
    public Boolean validateToken(String token) {
        Date expiration = extractExpiration(token);
        return !expiration.before(new Date());
    }

    // 提取用户名
    public static String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    // 提取过期时间
    public Date extractExpiration(String token) {
        return extractClaim(token, Claims::getExpiration);
    }


    private static  <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        Claims claims = extractAllClaims(token);
        System.out.println(claims.getSubject());;
        return claimsResolver.apply(claims);
    }

    private static Claims extractAllClaims(String token) {
        return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
    }

    private Boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }
}
