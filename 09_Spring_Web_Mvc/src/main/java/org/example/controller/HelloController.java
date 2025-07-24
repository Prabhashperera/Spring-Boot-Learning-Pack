package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloController {

    @GetMapping("index")
    public String hello() {
        return "index";
    }

    @GetMapping("about")
    public String about() {
        return "about";
    }
}
