package com.PetsGo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PetsGo.entities.Proprietario;
import com.PetsGo.repository.ProprietarioRepository;

@Service
public class ProprietarioService {
	   private ProprietarioRepository ProprietarioRepository;

	@Autowired
	    public ProprietarioService(ProprietarioRepository ProprietarioRepository) {
	        this.ProprietarioRepository = ProprietarioRepository;
	    }
	 
	    public List<Proprietario> getAllProprietarios() {
	        return ProprietarioRepository.findAll();
	    }

	    public Proprietario getProprietarioById(Long id) {
	        Optional<Proprietario> Proprietario = ProprietarioRepository.findById(id);
	        return Proprietario.orElse(null);
	    }

	    public Proprietario salvarProprietario(Proprietario Proprietario) {
	        return ProprietarioRepository.save(Proprietario);
	    }

	    public Proprietario updateProprietario(Long id, Proprietario updatedProprietario) {
	        Optional<Proprietario> existingProprietario = ProprietarioRepository.findById(id);
	        if (existingProprietario.isPresent()) {
	            updatedProprietario.setId(id);
	            return ProprietarioRepository.save(updatedProprietario);
	        }
	        return null;
	    }

	    public boolean deleteProprietario(Long id) {
	        Optional<Proprietario> existingProprietario = ProprietarioRepository.findById(id);
	        if (existingProprietario.isPresent()) {
	            ProprietarioRepository.deleteById(id);
	            return true;
	        }
	        return false;
	    }
}
