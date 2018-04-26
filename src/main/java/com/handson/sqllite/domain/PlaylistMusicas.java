package com.handson.sqllite.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "PlaylistMusicas")
public class PlaylistMusicas implements Serializable {

	@ManyToOne(targetEntity = Playlists.class)
	@JoinColumn(name="playListId", referencedColumnName="id")
	private String playListId;


	@ManyToOne(targetEntity = Musicas.class)
	@JoinColumn(name="musicaId", referencedColumnName="id")
	private String musicaId;
	
	@OneToMany(mappedBy = "musicas")
	private Musicas musicas;

	public String getPlayListId() {
		return playListId;
	}

	public void setPlayListId(String playListId) {
		this.playListId = playListId;
	}

	public String getMusicaId() {
		return musicaId;
	}

	public void setMusicaId(String musicaId) {
		this.musicaId = musicaId;
	}

	public Musicas getMusicas() {
		return musicas;
	}

	public void setMusicas(Musicas musicas) {
		this.musicas = musicas;
	}
	
	

}
