package rnd.user.domain;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String userId; // 아이디
    private String userPassword; // 비밀번호
    private String userName; // 이름

    public static User toEntity(UserDto dto) {
        return User.builder()
                .userId(dto.getUserId())
                .userPassword(dto.getUserPassword())
                .userName(dto.getUserName())
                .build();
    }
}
