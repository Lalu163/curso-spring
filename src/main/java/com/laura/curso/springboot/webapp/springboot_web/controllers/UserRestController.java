package com.laura.curso.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laura.curso.springboot.webapp.springboot_web.models.User;
import com.laura.curso.springboot.webapp.springboot_web.models.dto.UserDto;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details(){
        User user = new User("Laura", "Contreras");
        
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");
        
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list(){
        User user = new User("Laura", "Contreras");
        User user2 = new User("Anna", "Fernandez");
        User user3 = new User("Alba", "Pozo");

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        users.add(user3);

        return users;

    }

    @GetMapping("/details-map")
    public Map <String, Object> detailsMap(){
        User user = new User("Laura", "Contreras");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola Mundo Spring Boot");
        body.put("user", user);
        
        return body;
    }

}
