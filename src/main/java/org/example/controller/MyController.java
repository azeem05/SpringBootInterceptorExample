package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mycontroller")
public class MyController {

@GetMapping("/list")

    public String getAllDetails() {

    return "Hello";
    }

}
