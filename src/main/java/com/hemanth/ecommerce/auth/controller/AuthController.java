package com.hemanth.ecommerce.auth.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hemanth.ecommerce.auth.model.User;
import com.hemanth.ecommerce.auth.service.AuthService;



@RestController
@RequestMapping("/api/auth")
public class AuthController {


    private final AuthService authService;




    public AuthController(AuthService authService) {


        this.authService = authService;


    }


    // REGISTER API

    @PostMapping("/register")
    public User register(
            @RequestBody User user) {



        return authService.register(user);



    }


    // LOGIN API + JWT TOKEN

    @PostMapping("/login")
    public String login(
            @RequestBody User user) {



        return authService.login(user);

    }



}