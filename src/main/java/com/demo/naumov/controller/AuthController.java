package com.demo.naumov.controller;

import com.demo.naumov.dao.request.SignUpRequest;
import com.demo.naumov.dao.response.SignUpResponse;
import com.demo.naumov.model.User;
import com.demo.naumov.sevrice.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@AllArgsConstructor
public class AuthController {
    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<SignUpResponse> registrationUser
            (@RequestBody SignUpRequest signUpRequest){
        return userService.registrationUser(signUpRequest);
    }

}
