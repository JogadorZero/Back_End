package com.example.fipe.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/mundo")
    public String ola(@RequestParam String nome, @RequestParam String sobrenome){
        return "Olá " + nome + " " + sobrenome;
    }

    @PostMapping("/mundo")
    public String mundo(@RequestBody Pessoa pessoa){
        return "Isto é um método!";
    }
}