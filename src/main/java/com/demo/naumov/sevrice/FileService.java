package com.demo.naumov.sevrice;

import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;

public class FileService {
    public void saveImageForPost(
            MultipartFile[] files, String path,
            String type
    )
    {
        Arrays.stream(files).forEach((file)->{
            
        });
    }
}
