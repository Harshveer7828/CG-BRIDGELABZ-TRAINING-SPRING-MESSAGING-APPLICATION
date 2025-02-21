package com.example.springmessagingapp.controller;

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

}
