import java.util.HashMap;
import java.util.Map;

public class TokenTest {
    public static void main(String[] args) {
//        String token = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyYWRtaW4iLCJleHAiOjE3NDk3NTAxNjgsImlhdCI6MTc0OTc0NjU2OH0.kMcp2vU6om_jn8fV9ZSN7VzDunxQtgFtskeEowr3hes";

        Map<String , Object> map = new HashMap<>();
        map.put("userName","admin");
        map.put("tenId","1");
        map.put("userId","11");
        String token = JwtUtil.generateToken(map);

        String userName = JwtUtil.extractUsername(token);
        System.out.println(userName);
    }
}
