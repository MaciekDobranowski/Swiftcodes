package com.example.swiftcodes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AliveController {

    @GetMapping("/")
    public String hello() {
        return "Spring działa 💚";
    }
}
