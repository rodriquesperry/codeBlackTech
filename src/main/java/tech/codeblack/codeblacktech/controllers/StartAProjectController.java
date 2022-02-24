package tech.codeblack.codeblacktech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartAProjectController {
    @GetMapping("/start-a-project")
    public String  showProjectStart() {
        return "users/projectStart";
    }
}
