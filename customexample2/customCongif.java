package com.example.customexample2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




    @RestController
    @RequestMapping("/user")
    public class customCongif {
        @GetMapping("/home")
        public String display(){
            return "This is home";
        }
        @GetMapping("/dashboard")
        public String print(){
            return "This is dashboard";
        }

    }




