package com.projetoZetta.model;

import javax.persistence.*;

@Entity
@Table(schema="usermanager" , name="cargo")
public class Cargo {
	
	@Id
	@Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@Column(name="nome")
	private String nome;
	
    public Cargo() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
