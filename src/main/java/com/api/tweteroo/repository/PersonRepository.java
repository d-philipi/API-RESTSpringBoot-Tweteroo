package com.api.tweteroo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.tweteroo.models.Person;

public interface PersonRepository extends JpaRepository<Person,Long> {}
