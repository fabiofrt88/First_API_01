package com.develhope.First.API1;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping("/")
    public String get() {
        System.out.println("The name was called");
        return "Fabio";
    }

    @PostMapping(value = "{name}")
    public String post(@PathVariable String name){
        StringBuilder reverseName = new StringBuilder(name);
        reverseName.reverse();

        return reverseName.toString();
    }





}
