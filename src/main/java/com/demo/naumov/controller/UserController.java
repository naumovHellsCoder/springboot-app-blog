package com.demo.naumov.controller;

import com.demo.naumov.model.User;
import com.demo.naumov.sevrice.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("{userId}")
    public User getUser(@PathVariable("userId") Integer id){
        return userService.getUser(id);
    }
}
