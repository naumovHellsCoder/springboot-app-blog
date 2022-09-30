package com.demo.naumov.sevrice;

import com.demo.naumov.dao.request.CreatePostRequest;
import com.demo.naumov.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@Service
public class PostService {
    private final PostRepository postRepository;

    public ResponseEntity<String> createPost(
            CreatePostRequest createPostRequest,
            MultipartFile[] files){

        postRepository.save(null);
        return null;
    }
}
