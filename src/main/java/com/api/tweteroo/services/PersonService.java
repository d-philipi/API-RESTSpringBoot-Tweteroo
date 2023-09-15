package com.api.tweteroo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.tweteroo.dto.PersonDTO;
import com.api.tweteroo.models.Person;
import com.api.tweteroo.repository.PersonRepository;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public Person save(PersonDTO dto){
        return repository.save(new Person(dto));
    }
    
}
