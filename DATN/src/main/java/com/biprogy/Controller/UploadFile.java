package com.biprogy.Controller;

import com.biprogy.Service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value = "/upload-file")
public class UploadFile {

    @Autowired
    StorageService storageService;

    @GetMapping
    public String uploadFile() {
        return "upload-file";
    }

    @PostMapping
    public String save(@RequestParam("file") MultipartFile file) {
        this.storageService.store(file);
        return "/upload-file";
    }
}
