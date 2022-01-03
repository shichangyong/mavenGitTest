package com.scy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class first {
    @GetMapping("/hello")
    public String index() {
        return "HelloWorld~";
    }
}
