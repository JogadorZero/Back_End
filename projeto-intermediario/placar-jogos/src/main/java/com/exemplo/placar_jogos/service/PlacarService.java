package com.exemplo.placar_jogos.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

@Service
public class PlacarService {

    private static final String API_SEARCH_URL = "https://sofascore.p.rapidapi.com/search?q=";
    private static final String API_HOST = "sofascore.p.rapidapi.com";
    private static final String API_KEY = "660cb15b8emsh2dc778c7a8ebab1p13a0e0jsna2d62aab87c6";

    public String getJogosBrasileiros() {
        // Chamando o método original para obter jogos brasileiros
        return makeApiRequest("https://sofascore.p.rapidapi.com/tournaments/get-live-events?sport=football");
    }

    public String getJogosPorCampeonato(String campeonato) {
        // Monta a URL de busca com o nome do campeonato
        String apiUrlComCampeonato = API_SEARCH_URL + campeonato + "&type=all&page=0";
        return makeApiRequest(apiUrlComCampeonato);
    }

    private String makeApiRequest(String url) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.set("X-RapidAPI-Key", API_KEY);
            headers.set("X-RapidAPI-Host", API_HOST);

            HttpEntity<String> entity = new HttpEntity<>(headers);

            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

            return response.getBody();
        } catch (Exception e) {
            return "Erro ao obter os jogos: " + e.getMessage();
        }
    }
}
