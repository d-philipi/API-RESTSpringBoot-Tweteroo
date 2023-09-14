package com.api.tweteroo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.tweteroo.models.User;

public interface UserRepository extends JpaRepository<User,Long> {}
