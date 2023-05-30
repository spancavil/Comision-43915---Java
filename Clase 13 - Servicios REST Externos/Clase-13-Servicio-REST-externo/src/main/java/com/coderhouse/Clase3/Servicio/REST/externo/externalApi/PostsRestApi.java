package com.coderhouse.Clase3.Servicio.REST.externo.externalApi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@Service
@SuppressWarnings("unchecked")
public class PostsRestApi {
    @Value("${url_base_jsonPlaceHolder}")
    private String url_base_jsonPlaceHolder;
    public HashMap<String, Object> createPost(HashMap<String, Object> postBody) {
        RestTemplate restTemplate = new RestTemplate();
        final String url = url_base_jsonPlaceHolder + "/posts";
        return restTemplate.postForObject(url, postBody, HashMap.class);
    }

    public void updatePost(
            HashMap<String, Object> putBody,
            Integer postId
    ) {
        RestTemplate restTemplate = new RestTemplate();
        final String url = url_base_jsonPlaceHolder + "/posts/" + postId;
        restTemplate.put(url, putBody);
    }
}
