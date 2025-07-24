package org.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    public String getMapping() {
        return "GET";
    }

    @GetMapping(path = "/get2")
    public String getMapping2() {
        return "GET2";
    }

    @PostMapping
    public String postMapping() {
        return "POST";
    }
    @DeleteMapping
    public String deleteMapping() {
        return "DELETE";
    }
    @PutMapping
    public String putMapping() {
        return "PUT";
    }
}
