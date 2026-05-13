package com.example.uniDemo.controllers;

import com.example.uniDemo.models.User;
import com.example.uniDemo.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("users")
class UserController {

    private final UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/hello")
    public String testController(){
        return "Hello from user controller";
    }

    @GetMapping
    public List<User> getUsers(){
//        return List.of(new User());
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable String id){
//        return new User();
        return userService.getUserById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user){
//        return new User(user.getName(), user.getEmail(), user.getAge());
        return userService.createUser(user);
    }

}
