package br.rocha.spring01.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")  // receber requisições de outras origem
@RequestMapping("/sample")

public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Olá mundo!!";        
    }
    
}
