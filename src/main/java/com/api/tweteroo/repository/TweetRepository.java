package com.api.tweteroo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.tweteroo.models.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long>{}
