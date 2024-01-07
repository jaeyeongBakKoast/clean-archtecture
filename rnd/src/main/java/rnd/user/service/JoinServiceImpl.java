package rnd.user.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rnd.user.domain.User;
import rnd.user.domain.UserDto;
import rnd.user.persistence.JoinUserMapper;

@Service
@AllArgsConstructor
public class JoinServiceImpl implements JoinService {

    private final JoinUserMapper joinUserMapper;

    public boolean join(UserDto userDto) {
        User user = User.toEntity(userDto);
        int joinResult = joinUserMapper.join(user);
        return joinResult >= 0;
    }
}
