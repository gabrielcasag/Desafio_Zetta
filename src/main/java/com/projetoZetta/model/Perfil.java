package com.projetoZetta.model;

import javax.persistence.*;

@Entity
@Table(schema="usermanager" , name="perfil")
public class Perfil {
    
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
	
	@Column(name="nome")
	private String nome;
	
    public Perfil() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
