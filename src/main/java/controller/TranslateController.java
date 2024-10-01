package com.example.translateservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/translate")
public class TranslateController {

    @GetMapping
    public String translate(@RequestParam String text) {
        // Aquí deberías implementar la lógica de traducción.
        // Por ahora, simplemente devolveremos el texto original.
        return "Texto traducido: " + text;
    }
}
