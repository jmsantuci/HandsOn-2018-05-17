package com.handson.sqlite.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;


@SuppressWarnings("serial")
@Entity
@Table(name = "Artistas")
public class Musicas implements Serializable{
	
	
	@Id
	
	private String id;
	
	@NotBlank
	private String nome;
	
	
	@ManyToOne(targetEntity = Artistas.class, fetch = FetchType.LAZY)
	private Artistas artista;


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


	public Artistas getArtista() {
		return artista;
	}


	public void setArtista(Artistas artista) {
		this.artista = artista;
	}

	
	
	
}
