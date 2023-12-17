package hex.user.application.port.out;

import org.springframework.stereotype.Repository;
import hex.user.domain.User;

@Repository
public interface JoinUserPort {
    int join(User user);
}
