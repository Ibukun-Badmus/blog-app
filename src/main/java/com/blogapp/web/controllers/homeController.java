package com.blogapp.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homeController {
    @GetMapping("/")
    public @ResponseBody String showWelcome(){
        return "Welcome to Pentax!!!";
    }
}
