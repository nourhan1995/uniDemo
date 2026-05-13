package com.example.uniDemo.controllers;

import com.example.uniDemo.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
class UserController {

    @GetMapping("/hello")
    public String testController(){
        return "Hello from user controller";
    }

    @GetMapping
    public List<User> getUsers(){
        return List.of(new User());
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return new User(user.getName(), user.getEmail(), user.getAge());
    }

}
