package com.api.tweteroo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.tweteroo.dto.PersonDTO;
import com.api.tweteroo.services.PersonService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/")
public class PersonController {

    @Autowired
    private PersonService service;

    @PostMapping(value = "sign-up")
    public void hello(@RequestBody @Valid PersonDTO req){
        service.save(req);
    }
}
