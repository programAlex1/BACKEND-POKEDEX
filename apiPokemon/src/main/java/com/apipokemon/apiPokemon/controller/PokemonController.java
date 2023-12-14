package com.apipokemon.apiPokemon.controller;

import com.apipokemon.apiPokemon.service.PokemonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/api/v1/pokemon")
public class PokemonController {

    private final PokemonService pokemonService;
    @GetMapping()
    public ResponseEntity<Object> getAll(@RequestParam(required = false, defaultValue = "0") int offset,
                                        @RequestParam(required = false, defaultValue = "16") int limit){
       return ResponseEntity.ok(pokemonService.getAll(offset,limit));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable String id){
       return ResponseEntity.ok(pokemonService.getById(id));
    }

    @GetMapping("/species/{id}")
    public ResponseEntity<Object> species(@PathVariable String id){
        return ResponseEntity.ok(pokemonService.species(id));
    }
}
