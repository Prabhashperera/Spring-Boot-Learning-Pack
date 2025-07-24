package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("path")
public class PathVariableController {
    @GetMapping("{id}/{name}")
    public String getMapping(@PathVariable("id") String id, @PathVariable("name") String name) {
        return id + " " + name;
    }

    @GetMapping("customer/{id:[I][0-9]{3}}")
    public String getMapping02(@PathVariable("id") String id) {
        return id;
    }

    @GetMapping("item/{code}/branch/{city}")
    public String getMapping03(@PathVariable("code") String code, @PathVariable("city") String city) {
        return code + " " + city;
    }
}
