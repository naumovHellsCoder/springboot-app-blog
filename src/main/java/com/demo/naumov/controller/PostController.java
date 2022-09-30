package com.demo.naumov.controller;

import com.demo.naumov.dao.request.CreatePostRequest;
import com.demo.naumov.sevrice.PostService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1/post")
@AllArgsConstructor
public class PostController {
    private final PostService postService;
    @PostMapping("/create")
    public ResponseEntity<String> createPost(
        CreatePostRequest createPostRequest, MultipartFile[] files
    ){
    return postService.createPost(createPostRequest, files);
    }
}
