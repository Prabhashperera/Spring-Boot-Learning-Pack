package org.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("param")
public class ParamController {
    @GetMapping(params = {"name"})
    public String param(@RequestParam("name") String name) {
        return name;
    }
}
