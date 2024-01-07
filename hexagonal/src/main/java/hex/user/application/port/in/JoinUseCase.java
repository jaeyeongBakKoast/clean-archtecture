package hex.user.application.port.in;

import hex.user.domain.UserDto;

public interface JoinUseCase {
    boolean join(UserDto userDto);
}
