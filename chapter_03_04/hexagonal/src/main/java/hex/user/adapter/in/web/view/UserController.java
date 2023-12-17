package hex.user.adapter.in.web.view;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import hex.user.application.JoinService;
import hex.user.domain.UserDto;

@Controller
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final JoinService joinService;

    @GetMapping("/join")
    public String join() {
        return "/user/join";
    }

    @PostMapping("/process-join")
    public String join(@ModelAttribute("joinForm") UserDto joinForm) {
        joinService.join(joinForm);
        return "/user/join";
    }
}
