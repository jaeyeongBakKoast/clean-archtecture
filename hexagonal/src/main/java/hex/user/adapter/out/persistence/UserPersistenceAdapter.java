package hex.user.adapter.out.persistence;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import hex.user.application.port.out.JoinUserPort;
import hex.user.domain.User;

@Repository
@RequiredArgsConstructor
@PropertySource("classpath:sqlmap/user.xml")
public class UserPersistenceAdapter implements JoinUserPort {
    private final JdbcTemplate jdbcTemplate;

    @Value("${user.join}")
    private String joinUserQuery;

    public int join(User user) {
        BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(user);
        NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);

        return namedParamJdbcTemplate.update(joinUserQuery, paramSource);
    }
}
