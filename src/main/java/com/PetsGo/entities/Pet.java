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
@Table(name = "pet")
public class Pet {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "numeroDocumento", nullable = false)
	private String numeroDocumento;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "dataNascimento", nullable = false)
	private String dataNascimento;
	
	@Column(name = "cor", nullable = false)
	private String cor;
	
	@Column(name = "raca", nullable = false)
	private String raca;
	
	@ManyToOne 
	@JoinColumn(name = "propi_id", nullable = false)
	private Proprietario propietario;
	
	@ManyToOne 
	@JoinColumn(name = "tipo_id", nullable = false)
	private Tipo tipo;

}