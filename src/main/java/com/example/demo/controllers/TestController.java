package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/get")
    public String get() {
        return "You are requested ALL";
    }

    @GetMapping("/get/{id}")
    public String getWithPatchVariable(@PathVariable String id) {
        return "You are requested " + id;
    }

    /*@GetMapping("/get")
    public String getWithParams(@RequestParam String id) {
        return "You are requested " + id;
    }*/
}
