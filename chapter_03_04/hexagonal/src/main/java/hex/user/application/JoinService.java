package hex.user.application;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import hex.user.application.port.in.JoinUseCase;
import hex.user.application.port.out.JoinUserPort;
import hex.user.domain.User;
import hex.user.domain.UserDto;

@Service
@AllArgsConstructor
public class JoinService implements JoinUseCase {

    private final JoinUserPort joinUserPort;

    public boolean join(UserDto userDto) {
        User user = User.toEntity(userDto);
        int joinResult = joinUserPort.join(user);
        return joinResult >= 0;
    }
}
