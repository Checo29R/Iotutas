package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Actor;

public interface ActorRepository 
        extends JpaRepository<Actor, Long> {
    // No additional methods are needed as JpaRepository provides basic CRUD
    // operations

}
