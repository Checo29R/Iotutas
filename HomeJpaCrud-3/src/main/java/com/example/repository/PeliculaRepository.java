package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Pelicula;

public interface PeliculaRepository 
    extends JpaRepository<Pelicula, Long>
    {

}
