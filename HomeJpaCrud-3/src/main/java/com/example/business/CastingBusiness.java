package com.example.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Casting;
import com.example.repository.CastingRepository;

@Service
public class CastingBusiness {

    @Autowired
    private CastingRepository castingRepository;
    
    /**
     * Procesa un casting.
     * 
     * @param casting
     */
    public void processarCasting(Casting casting) {
        // Adds or updates the casting.
        castingRepository.save(casting);
    }
    
    public Casting buscarCastingPorId(Long id) {
        return castingRepository.findById(id).orElse(null);
    }
    
    public void eliminarCastingPorId(Long id) {
        castingRepository.deleteById(id);
    }
    
    public List<Casting> buscarTodosCastings() {
        return castingRepository.findAll();
    }
    
    
}
