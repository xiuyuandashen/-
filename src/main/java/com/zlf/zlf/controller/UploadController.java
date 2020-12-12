package com.zlf.zlf.controller;


import com.zlf.zlf.util.GithubUploader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController {


    @Autowired
    private GithubUploader githubUploader;

    @RequestMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile multipartFile) throws Exception{
        String url = githubUploader.upload(multipartFile);
        return url;
    }
}
