package com.exemplo.placar_jogos.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

@Service
public class PlacarService {

    private static final String API_URL = "https://sofascore.p.rapidapi.com/tournaments/get-live-events?sport=football";
    private static final String API_HOST = "sofascore.p.rapidapi.com";
    private static final String API_KEY = "660cb15b8emsh2dc778c7a8ebab1p13a0e0jsna2d62aab87c6";

    public String getJogosBrasileiros() {
        try {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.set("X-RapidAPI-Key", API_KEY);
            headers.set("X-RapidAPI-Host", API_HOST);

            HttpEntity<String> entity = new HttpEntity<>(headers);

            // Fazendo a requisição GET à API SofaScore
            ResponseEntity<String> response = restTemplate.exchange(API_URL, HttpMethod.GET, entity, String.class);

            return response.getBody();  // Retorna o JSON dos jogos brasileiros
        } catch (Exception e) {
            return "Erro ao obter os jogos: " + e.getMessage();
        }
    }
}
