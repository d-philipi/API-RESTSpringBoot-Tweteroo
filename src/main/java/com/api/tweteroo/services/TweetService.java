package com.api.tweteroo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.tweteroo.dto.PersonDTO;
import com.api.tweteroo.dto.TweetDTO;
import com.api.tweteroo.models.Tweet;
import com.api.tweteroo.repository.PersonRepository;
import com.api.tweteroo.repository.TweetRepository;

@Service
public class TweetService {
    
    @Autowired
    private TweetRepository tweetRepository;

    @Autowired
    private PersonRepository personRepository;

    public void save(TweetDTO req){
        PersonDTO person = personRepository.findByUsername(req.username());
        tweetRepository.save(new Tweet(person, req.tweet()));
    }
}
