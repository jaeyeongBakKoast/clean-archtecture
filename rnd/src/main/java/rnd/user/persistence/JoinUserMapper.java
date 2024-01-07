package rnd.user.persistence;

import org.springframework.stereotype.Repository;
import rnd.user.domain.User;

@Repository
public interface JoinUserMapper {
    int join(User user);
}
