package com.PetsGo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PetsGo.entities.Veterinario;
import com.PetsGo.repository.VeterinarioRepository;

@Service
public class VeterinarioService {
	   private final VeterinarioRepository veterinarioRepository;

	@Autowired
	    public VeterinarioService(VeterinarioRepository veterinarioRepository) {
	        this.veterinarioRepository = veterinarioRepository;
	    }
	 
	    public List<Veterinario> getAllVeterinario() {
	        return veterinarioRepository.findAll();
	    }

	    public Veterinario getVeterinarioById(Long id) {
	        Optional<Veterinario> veterinario = veterinarioRepository.findById(id);
	        return veterinario.orElse(null);
	    }

	    public Veterinario salvarVeterinario(Veterinario veterinario) {
	        return veterinarioRepository.save(veterinario);
	    }

	    public Veterinario updateVeterinario(Long id, Veterinario updatedVeterinario) {
	        Optional<Veterinario> existingVeterinario= veterinarioRepository.findById(id);
	        if (existingVeterinario.isPresent()) {
	            updatedVeterinario.setId(id);
	            return veterinarioRepository.save(updatedVeterinario);
	        }
	        return null;
	    }

	    public boolean deleteVeterinario(Long id) {
	        Optional<Veterinario> existingVeterinario = veterinarioRepository.findById(id);
	        if (existingVeterinario.isPresent()) {
	            veterinarioRepository.deleteById(id);
	            return true;
	        }
	        return false;
	    }
}
