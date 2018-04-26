package com.handson.sqlite.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;


@SuppressWarnings("serial")
@Entity
@Table(name = "Artistas")
public class Artistas implements Serializable{

	@Id
	private String id;
	
	@NotBlank
	private String nome;
	
	@OneToMany(mappedBy = "Musicas", targetEntity = Musicas.class, fetch = FetchType.LAZY)
	private List<Musicas> musicas;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	


}
