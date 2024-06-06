package com.PetsGo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PetsGo.entities.Consulta;
import com.PetsGo.repository.ConsultaRepository;

@Service
public class ConsultaService {
	   private ConsultaRepository ConsultaRepository;

	@Autowired
	    public ConsultaService(ConsultaRepository ConsultaRepository) {
	        this.ConsultaRepository = ConsultaRepository;
	    }
	 
	    public List<Consulta> getAllConsultas() {
	        return ConsultaRepository.findAll();
	    }

	    public Consulta getConsultaById(Long id) {
	        Optional<Consulta> Consulta = ConsultaRepository.findById(id);
	        return Consulta.orElse(null);
	    }

	    public Consulta salvarConsulta(Consulta Consulta) {
	        return ConsultaRepository.save(Consulta);
	    }

	    public Consulta updateConsulta(Long id, Consulta updatedConsulta) {
	        Optional<Consulta> existingConsulta = ConsultaRepository.findById(id);
	        if (existingConsulta.isPresent()) {
	            updatedConsulta.setId(id);
	            return ConsultaRepository.save(updatedConsulta);
	        }
	        return null;
	    }

	    public boolean deleteConsulta(Long id) {
	        Optional<Consulta> existingConsulta = ConsultaRepository.findById(id);
	        if (existingConsulta.isPresent()) {
	            ConsultaRepository.deleteById(id);
	            return true;
	        }
	        return false;
	    }
}
