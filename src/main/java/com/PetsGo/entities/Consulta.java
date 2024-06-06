
package com.PetsGo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "consulta")
public class Consulta {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "data", nullable = false)
	private String data;
	
	@Column(name = "hora", nullable = false)
	private String hora;
	
	@Column(name = "descricao", nullable = false)
	private String descricao;
	
	@ManyToOne 
	@JoinColumn(name = "pet_id", nullable = false)
	private Pet pet;
	
	@ManyToOne 
	@JoinColumn(name = "vet_id", nullable = false)
	private Veterinario veterinario;

}
