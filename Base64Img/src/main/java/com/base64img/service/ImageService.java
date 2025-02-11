package com.base64img.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;

@Service
public class ImageService {

    public String convertToBase64(MultipartFile file) throws IOException{
        byte[] imageBytes = file.getBytes();
        System.out.println("업로드 완료 !");
        return Base64.getEncoder().encodeToString(imageBytes);
    }
}
