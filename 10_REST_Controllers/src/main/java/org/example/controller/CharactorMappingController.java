package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("char")
public class CharactorMappingController {
    @GetMapping("item/I???")
    public String getMapping() {
        return "CharactorMappingController";
    }
    @GetMapping("???/search")
    public String getMapping2() {
        return "PUPUPUPUPUPUP";
    }
}
