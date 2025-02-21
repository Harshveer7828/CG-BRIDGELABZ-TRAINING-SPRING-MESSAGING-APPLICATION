package com.example.springmessagingapp.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // GET request to respond hello message to the user
    @GetMapping
    public String hello(){
        return "Hello From BridgeLabz";
    }



}
