package tech.codeblack.codeblacktech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin("http://localhost:3000/")
public class IndexController {

    @GetMapping("/")
    public String hello() {
        return "index";
    }
}
