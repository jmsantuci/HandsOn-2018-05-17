package com.handson.sqllite.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@SuppressWarnings("serial")
@Entity
@Table(name = "Playlists")
public class Playlists implements Serializable {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private String id;
	
	
	@ManyToOne(targetEntity = PlaylistMusicas.class)
	private List<PlaylistMusicas> playListMusicas;
	
	
	@ManyToOne(targetEntity = Usuarios.class)
    @JoinColumn(name="usuario", referencedColumnName="id")
	private Usuarios usuario;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<PlaylistMusicas> getPlayListMusicas() {
		return playListMusicas;
	}

	public void setPlayListMusicas(List<PlaylistMusicas> playListMusicas) {
		this.playListMusicas = playListMusicas;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}	
}
