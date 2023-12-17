package rnd.user.persistence;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import rnd.user.domain.User;

@Service
@AllArgsConstructor
public class UserPersistenceAdapter implements JoinUserMapper {
    private final JdbcTemplate jdbcTemplate;

    public int join(User user) {
        String sql = "INSERT INTO users (user_id, user_password, user_name) VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql, user.getUserId(), user.getUserPassword(), user.getUserName());
    }
}
