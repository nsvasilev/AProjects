package com.example.AstonExample.controllers;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
@GetMapping("/")
    public String product(){
    return "product";
}
}
