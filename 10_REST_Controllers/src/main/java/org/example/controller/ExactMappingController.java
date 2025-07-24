package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ExactMappingController {
    @GetMapping
    public String exactMapping() {
        return "exactMapping";
    }

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("hello/two")
    public String exactMapping2() {
        return "exactMapping2";
    }

    @GetMapping("hello/three")
    public String exactMapping3() {
        return "exactMapping3";
    }
}
