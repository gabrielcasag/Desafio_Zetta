package com.projetoZetta.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Pessoa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="nome" , nullable=false)
	private String nome;
	
	@Column(name="cpf" , nullable=false , unique=true)
	private String cpf;
	
	@Column(name="data_nascimento" , nullable=false)
	private String data_nascimento;
	
	@Column(name="sexo" , nullable=false)
	private String sexo;
	

	public Pessoa() {
	}
	
	public Pessoa(String nome, String cpf, String data_nascimento, String sexo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.data_nascimento = data_nascimento;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
