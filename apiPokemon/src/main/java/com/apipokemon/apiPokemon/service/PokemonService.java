package com.apipokemon.apiPokemon.service;

public interface PokemonService {

    Object getAll( int offset, int limit);
    Object getById(String id);

    Object species(String id);
}
