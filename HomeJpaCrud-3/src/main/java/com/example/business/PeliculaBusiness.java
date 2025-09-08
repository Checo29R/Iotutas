package com.example.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Pelicula;
import com.example.repository.PeliculaRepository;

@Service
public class PeliculaBusiness {

    
    @Autowired
    private PeliculaRepository peliculaRepository;
    
    /**
     * Procesa una película.
     * 
     * @param pelicula
     */
    public void processarPelicula(Pelicula pelicula) {
        // Adds or updates the movie.
        peliculaRepository.save(pelicula);
    }

    public Pelicula buscarPeliculaPorId(Long id) {
        return peliculaRepository.findById(id).orElse(null);
    }

    public void eliminarPeliculaPorId(Long id) {
        peliculaRepository.deleteById(id);
    }

    public List<Pelicula> buscarTodasPeliculas() {
        return peliculaRepository.findAll();
    }

 
    
}
