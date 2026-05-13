package com.example.uniDemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("users")
class UserController {

    @GetMapping("/hello")
    public String testController(){
        return "Hello from user controller";
    }


}
