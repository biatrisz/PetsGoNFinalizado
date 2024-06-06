package com.PetsGo.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PetsGo.entities.Pet;
import com.PetsGo.repository.PetRepository;

@Service
public class PetService { 
	 private final PetRepository petRepository;
	 
	   @Autowired
	    public PetService(PetRepository petRepository) {
	        this.petRepository = petRepository;
	    }
	 
	    public List<Pet> getAllPet() {
	        return petRepository.findAll();
	    }

	    public Pet getPetById(Long id) {
	        Optional<Pet> pet= petRepository.findById(id);
	        return pet.orElse(null);
	    }

	    public Pet salvarPet(Pet pet) {
	        return petRepository.save(pet);
	    }

	    public Pet updatePet(Long id, Pet updatedPet) {
	        Optional<Pet> existingPet = petRepository.findById(id);
	        if (existingPet.isPresent()) {
	            updatedPet.setId(id);
	            return petRepository.save(updatedPet);
	        }
	        return null;
	    }

	    public boolean deletePet(Long id) {
	        Optional<Pet> existingPet= petRepository.findById(id);
	        if (existingPet.isPresent()) {
	            petRepository.deleteById(id);
	            return true;
	        }
	        return false;
	    }
	  
}
