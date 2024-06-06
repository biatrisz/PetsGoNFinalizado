package com.PetsGo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PetsGo.entities.Tipo;
import com.PetsGo.repository.TipoRepository;

@Service
public class TipoService {

	private TipoRepository TipoRepository;

	@Autowired
	    public TipoService(TipoRepository TipoRepository) {
	        this.TipoRepository = TipoRepository;
	    }
	 
	    public List<Tipo> getAllTipos() {
	        return TipoRepository.findAll();
	    }

	    public Tipo getTipoById(Long id) {
	        Optional<Tipo> Tipo = TipoRepository.findById(id);
	        return Tipo.orElse(null);
	    }

	    public Tipo salvarTipo(Tipo Tipo) {
	        return TipoRepository.save(Tipo);
	    }

	    public Tipo updateTipo(Long id, Tipo updatedTipo) {
	        Optional<Tipo> existingTipo = TipoRepository.findById(id);
	        if (existingTipo.isPresent()) {
	            updatedTipo.setId(id);
	            return TipoRepository.save(updatedTipo);
	        }
	        return null;
	    }

	    public boolean deleteTipo(Long id) {
	        Optional<Tipo> existingTipo = TipoRepository.findById(id);
	        if (existingTipo.isPresent()) {
	            TipoRepository.deleteById(id);
	            return true;
	        }
	        return false;
	    }
}
