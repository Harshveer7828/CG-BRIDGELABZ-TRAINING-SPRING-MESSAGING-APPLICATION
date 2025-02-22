package com.example.springmessagingapp.controller;

import com.example.springmessagingapp.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // GET request to respond hello message to the user
    @GetMapping
    public String hello() {
        return "Hello From BridgeLabz";
    }

    // GET request to extract the name from the query parameter
    @GetMapping("/query")
    public String sayHello(@RequestParam String name){
        return "Hello " + name + " from BridgeLabz";
    }

    // GET request to extract the name from path variables
    @GetMapping("{name}")
    public String sayAgainHello(@PathVariable String name){
        return "Hello " + name + " from BridgeLabz";
    }

    // POST request to extract the first name and the last name
    @PostMapping("/post")
    public String displayName(@RequestBody UserDTO user){
        return "Hello " + user.getFirstName() + " " +user.getLastName() + " from BridgeLabz ";
    }

    // PUT request to extract first name and last name;
    @PutMapping("/user/{firstname}/lastname")
    public String displayNamePut(@PathVariable String firstname,@RequestParam String lastname){
        return "Hello " + firstname + " " + lastname + " From BridgeLabz";
    }

}
