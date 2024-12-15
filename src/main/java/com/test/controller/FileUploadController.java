package com.test.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/files")
@Slf4j
public class FileUploadController {

    // Define the path where files will be saved
    private static final String UPLOAD_DIR = "uploads/images";

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {

        if (file.isEmpty()) {
            return new ResponseEntity<>("File is empty", HttpStatus.BAD_REQUEST);
        }

        try {
            String fileName = file.getOriginalFilename();
            if (fileName == null || fileName.contains("..")) {
                return new ResponseEntity<>("Invalid file name", HttpStatus.BAD_REQUEST);
            }

            // Full path to save the file in the new external folder
            Path filePath = Paths.get(UPLOAD_DIR, fileName);

            Files.createDirectories(filePath.getParent());

            // Save the file to the external folder
            Files.copy(file.getInputStream(), filePath);

            return new ResponseEntity<>("File uploaded successfully: " + filePath, HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity<>("Could not upload the file", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public List<String> getImgUrls() {

        File folder = new File(UPLOAD_DIR);  // Use the new upload directory
        File[] listFiles = folder.listFiles();
        ArrayList<String> imglist = new ArrayList<>();
        for (File file : listFiles) {
            if (file.isFile()) {
                imglist.add("/imgs/" + file.getName());
            }
        }
        return imglist;
    }

	
}