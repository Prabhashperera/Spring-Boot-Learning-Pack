package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wild")
public class WildCardController {
    @GetMapping("test/*/hello")
    public String wild() {
        return "wild";
    }
}
