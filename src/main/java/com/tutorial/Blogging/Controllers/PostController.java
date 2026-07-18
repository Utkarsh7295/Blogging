package com.tutorial.Blogging.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    @GetMapping("/post")
    public String getPosts() {
        return "Hello, writing my first controller!";
    }
}
