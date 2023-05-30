package com.coderhouse.Clase3.Servicio.REST.externo.service;

import com.coderhouse.Clase3.Servicio.REST.externo.externalApi.CharactersRestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class CharactersService {
    @Autowired
    private CharactersRestApi charactersRestApi;

    public HashMap<String, Object> getCharacters(){
        return charactersRestApi.getCharacters();
    }

    public HashMap<String, Object> getCharacterById(int id){
        return charactersRestApi.getCharacterById(id);
    }
}
