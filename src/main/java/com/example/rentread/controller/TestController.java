package com.example.rentread.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/1")
    public String test1() {
        return "First route";
    }
    @GetMapping("/2")
    public String test2() {
        return "Second route";
    }
}
