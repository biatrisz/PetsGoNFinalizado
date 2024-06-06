package com.PetsGo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PetsGo.entities.Especialidade;
import com.PetsGo.repository.EspecialidadeRepository;

@Service
public class EspecialidadeService {
	   private EspecialidadeRepository EspecialidadeRepository;

	@Autowired
	    public EspecialidadeService(EspecialidadeRepository EspecialidadeRepository) {
	        this.EspecialidadeRepository = EspecialidadeRepository;
	    }
	 
	    public List<Especialidade> getAllEspecialidades() {
	        return EspecialidadeRepository.findAll();
	    }

	    public Especialidade getEspecialidadeById(Long id) {
	        Optional<Especialidade> Especialidade = EspecialidadeRepository.findById(id);
	        return Especialidade.orElse(null);
	    }

	    public Especialidade salvarEspecialidade(Especialidade Especialidade) {
	        return EspecialidadeRepository.save(Especialidade);
	    }

	    public Especialidade updateEspecialidade(Long id, Especialidade updatedEspecialidade) {
	        Optional<Especialidade> existingEspecialidade = EspecialidadeRepository.findById(id);
	        if (existingEspecialidade.isPresent()) {
	            updatedEspecialidade.setId(id);
	            return EspecialidadeRepository.save(updatedEspecialidade);
	        }
	        return null;
	    }

	    public boolean deleteEspecialidade(Long id) {
	        Optional<Especialidade> existingEspecialidade = EspecialidadeRepository.findById(id);
	        if (existingEspecialidade.isPresent()) {
	            EspecialidadeRepository.deleteById(id);
	            return true;
	        }
	        return false;
	    }
}
