package com.example.exercicio07.filmes;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecomendacaoController {

    private static final Map<String, String> filmes = new HashMap<>();

    static {
        // Adicionando alguns filmes com base no gênero e ambientação
        filmes.put("acao:futurista", "Homens de Preto");
        filmes.put("acao:apocaliptico", "Mad Max: Estrada da Fúria");
        filmes.put("comedia:futurista", "De Volta Para o Futuro");
        filmes.put("comedia:medieval", "Monty Python e o Cálice Sagrado");
        filmes.put("drama:historico", "A Lista de Schindler");
        filmes.put("aventura:futurista", "Guardiões da Galáxia");
    }

    @GetMapping("/recomendar")
    public String recomendarFilme(
            @RequestParam String genero,
            @RequestParam String ambiente) {
        String chave = genero.toLowerCase() + ":" + ambiente.toLowerCase();
        return filmes.getOrDefault(chave, "Nenhuma recomendação disponível para esse gênero e ambiente.");
    }
}
