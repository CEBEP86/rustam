package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;


@RestController
public class CityController {


    @PostMapping("/yo")
    public String findCities() {

        return "ok";
    }
}