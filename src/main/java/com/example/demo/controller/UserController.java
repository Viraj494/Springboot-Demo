package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/user")
@CrossOrigin
public class UserController {

    @GetMapping("/getuser")
    public String getUser() {
        return "demo project";
    }

    @PostMapping("/saveuser")
    public String setUser(){
        return "User Saved!";
    }

    @PutMapping("/updateuser")
    public String updateUser(){
        return "User Updated!";
    }

    @DeleteMapping("/deleteuser")
    public String DeleteUser(){
        return "User Deleted!";
    }


}
