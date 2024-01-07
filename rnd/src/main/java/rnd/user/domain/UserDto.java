package rnd.user.domain;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String userId; // 아이디
    private String userPassword; // 비밀번호
    private String userName; // 이름

    public static UserDto toDTO(User entity) {
        return UserDto.builder()
                .userId(entity.getUserId())
                .userPassword(entity.getUserPassword())
                .userName(entity.getUserName())
                .build();
    }
}
