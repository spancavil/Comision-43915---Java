package com.coderhouse.Clase3.Servicio.REST.externo.externalApi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@Service
@SuppressWarnings("unchecked")
public class CharactersRestApi {

    //Podemos utilizar los values de application.properties
    @Value("${url_base_rickMorty}")
    private String url_base_rickMorty;

    public HashMap<String, Object> getCharacters() {
        RestTemplate restTemplate = new RestTemplate();

        final String url = url_base_rickMorty + "/character";

        //El primer parámetro es la url y el segundo parámetro es lo que devuelve esa url
        return restTemplate.getForObject(url, HashMap.class);
    }

    public HashMap<String, Object> getCharacterById(int id) {
        RestTemplate restTemplate = new RestTemplate();

        final String url = url_base_rickMorty + "/character/" + id;
        return restTemplate.getForObject(url, HashMap.class);
    }
}
