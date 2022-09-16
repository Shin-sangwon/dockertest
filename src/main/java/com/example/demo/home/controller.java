package com.example.demo.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {

    @ResponseBody
    @GetMapping("/")
    public String main() {

        return "Hello SB";
    }
}
