package com.api.tweteroo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.tweteroo.dto.TweetDTO;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tweets")
public class TweetController {
    
    @PostMapping
    public void hello(@RequestBody @Valid TweetDTO req){
        System.out.println(req);
    }
}
