package com.example.boot_docker;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {
    @GetMapping("hello")
    public String getMethodName() {
        return "안녕하세요.";
    }
    
}
