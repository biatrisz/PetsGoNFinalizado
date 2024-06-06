
package com.PetsGo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "proprietario")
public class Proprietario {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "cidade", nullable = false)
	private String cidade;
	
	@Column(name = "numeroRua", nullable = false)
	private String numeroRua;
	
	@Column(name = "bairro", nullable = false)
	private String bairro;
	
	@Column(name = "nomeRua", nullable = false)
	private String nomeRua;
	
	@Column(name = "cpf", nullable = false)
	private String cpf;
	
	@Column(name = "rg", nullable = false)
	private String rg;

	@Column(name = "telefoneCelular", nullable = false)
	private String telefoneCelular;
	
	@Column(name = "telefoneFixo", nullable = false)
	private String telefoneFixo;

}
