package com.coderhouse.Clase3.Servicio.REST.externo.controller;

import com.coderhouse.Clase3.Servicio.REST.externo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    @Autowired
    private PostService postService;
    @PostMapping
    public ResponseEntity<HashMap<String,Object>> createPost (@RequestBody HashMap<String, Object> requestPost) {
        System.out.println(requestPost);
        return ResponseEntity.ok(postService.createPost(requestPost));
    }
}
