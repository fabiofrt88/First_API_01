package com.develhope.First.API1;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("")
    public String get() {
        System.out.println("The name was called");
        return "Fabio";
    }

    @PostMapping(value = "/{name}")
    public String post(@PathVariable String name){
        StringBuilder reverseName = new StringBuilder(name);
        reverseName.reverse();

        return reverseName.toString();
    }

    // Su postman
    //   (GET) localhost:8080/name
    //   (POST) localhost:8080/name/Fabio
 }
