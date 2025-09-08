package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Casting;

public interface CastingRepository 
    extends JpaRepository<Casting, Long> {

}
