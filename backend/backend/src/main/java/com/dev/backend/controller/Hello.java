package com.dev.backend.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Hello {

    // Endpoint principal: Parâmetro "param" agora é opcional
    @GetMapping("/")
    public String getMethodName(@RequestParam(required = false, defaultValue = "Mundo") String param) {
        return "Olá, " + param + "!";
    }

    // Novo endpoint para "helloWorld"
    @GetMapping("/hello")
    public String helloWorld() {
        return "Olá mundo! Data atual: " + LocalDate.now();
    }
}
