package com.PetsGo.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.PetsGo.entities.Pet;

public interface PetRepository extends JpaRepository <Pet, Long>{
	
}
