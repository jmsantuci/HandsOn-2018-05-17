package com.handson.sqllite.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotBlank;


@SuppressWarnings("serial")
@Entity
@Table(name = "Musicas")
public class Musicas implements Serializable{
	
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private String id;
	
	@NotBlank
	@Column
	private String nome;
	
	
	@ManyToOne(targetEntity = Artistas.class)
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
