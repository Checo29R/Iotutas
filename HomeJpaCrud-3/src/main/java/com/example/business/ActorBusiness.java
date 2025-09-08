package com.example.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Actor;
import com.example.repository.ActorRepository;

@Service
public class ActorBusiness {

    @Autowired
    private ActorRepository actorRepository;
    
    /**
     * Procesa un actor.
     * 
     * @param actor
     */
    public void processarActor(Actor actor) {
        // Adds or updates the actor.
        actorRepository.save(actor);
    }
    
    public Actor buscarActorPorId(Long id) {
        return actorRepository.findById(id).orElse(null);
    }
    
    public void eliminarActorPorId(Long id) {
        actorRepository.deleteById(id);
    }
    
    public List<Actor> buscarTodosActores() {
        return actorRepository.findAll();
    }
}
