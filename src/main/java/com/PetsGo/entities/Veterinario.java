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
@Table(name = "veterinario")
public class Veterinario {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "CRMV", nullable = false)
	private String CRMV;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "cpf", nullable = false)
	private String cpf;
	
	@Column(name = "numeroRua", nullable = false)
	private String numeroRua;
	
	@Column(name = "bairro", nullable = false)
	private String bairro;
	
	@Column(name = "nomeRua", nullable = false)
	private String nomeRua;
	
	@Column(name = "rg", nullable = false)
	private String rg;
	
	@Column(name = "telefoneCelular", nullable = false)
	private String telefoneCelular;
	
	@Column(name = "telefoneFixo", nullable = false)
	private String telefoneFixo;
	
	@ManyToOne 
	@JoinColumn(name = "especi_id", nullable = false)
	private Especialidade especialidade;
}