package com.projetoZetta.models;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(schema="usermanager" , name="usuario")
public class Usuario extends Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cargo_id")
	private Cargo cargo;
	
	@ManyToMany
	private List<Perfil> perfis;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public List<Perfil> getPerfis() {
		return perfis;
	}

	public void setPerfil(List<Perfil> perfis) {
		this.perfis = perfis;
	}
	
	
	
}
	