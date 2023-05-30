package com.coderhouse.Clase3.Servicio.REST.externo.service;

import com.coderhouse.Clase3.Servicio.REST.externo.externalApi.CharactersRestApi;
import com.coderhouse.Clase3.Servicio.REST.externo.externalApi.PostsRestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
@Service
public class PostService {
    @Autowired
    private PostsRestApi postsRestApi;

    public HashMap<String, Object> createPost(
            HashMap<String, Object> postBody
    ){
        return postsRestApi.createPost(postBody);
    }

    public void updatePost(
            HashMap<String, Object> putBody,
            Integer postId
    ) {
        postsRestApi.updatePost(putBody, postId);
    }
}
