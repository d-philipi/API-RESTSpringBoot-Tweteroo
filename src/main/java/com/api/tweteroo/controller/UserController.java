package com.api.tweteroo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.tweteroo.dto.UserDTO;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/")
public class UserController {
    @PostMapping(value = "sign-up")
    public void hello(@RequestBody @Valid UserDTO req){
        System.out.println("Está funcionando, " + req.username());
    }
}
