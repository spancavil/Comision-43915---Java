package com.coderhouse.Clase3.Servicio.REST.externo.controller;

import com.coderhouse.Clase3.Servicio.REST.externo.service.CharactersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api/v1/characters")
public class CharactersController {
    @Autowired
    private CharactersService charactersService;

    @GetMapping
    public ResponseEntity<HashMap<String, Object>> getCharacters(){
        var characters = charactersService.getCharacters();
        return ResponseEntity.ok(characters);
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<HashMap<String, Object>> getCharacter(@PathVariable("id") Integer id){
        var characters = charactersService.getCharacterById(id);
        return ResponseEntity.ok(characters);
    }
}
