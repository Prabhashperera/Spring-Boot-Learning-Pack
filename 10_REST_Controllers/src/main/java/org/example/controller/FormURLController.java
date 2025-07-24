package org.example.controller;

import org.example.dto.City;
import org.example.dto.UserDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("form")
public class FormURLController {
    @PostMapping(value = "save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String saveUser(@RequestBody UserDto user) {
        System.out.println(user.toString());
        return "user saved";
    }

    @GetMapping(value = "get", consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserDto getUser() {
        UserDto user = new UserDto();
        City city = new City();
        user.setuName("test");
        user.setuId("id");
        user.setuAddress("address");
        city.setCode("code");
        city.setName("name");
        user.setCity(city);
        return user;
    }
}
