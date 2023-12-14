package com.apipokemon.apiPokemon.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service @RequiredArgsConstructor
public class PokemonServiceImpl implements PokemonService{


    @Override
    public Object getAll(int offset, int limit) {
        try {
            String uri = "https://pokeapi.co/api/v2/pokemon?offset=" + offset + "&limit=" + limit;
            RestTemplate template = new RestTemplate();
            return template.getForObject(uri, Object.class);
        } catch (RestClientException e) {
            return e;
        }
    }

    @Override
    public Object getById(String id) {
        try {
            String uri = "https://pokeapi.co/api/v2/pokemon/" + id;
            RestTemplate template = new RestTemplate();
            return template.getForObject(uri, Object.class);
        } catch (RestClientException e) {
            return e;
        }
    }

    @Override
    public Object species(String id) {
        try {
            String uri = "https://pokeapi.co/api/v2/pokemon-species/" + id;
            RestTemplate template = new RestTemplate();
            return template.getForObject(uri, Object.class);
        } catch (RestClientException e) {
            return e;
        }
    }
}
