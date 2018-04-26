package com.handson.sqllite.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "PlaylistMusicas")
public class PlaylistMusicas implements Serializable {

	@Id
	@Column(name="PlaylistId")
	private String playListId;

	@Id
	@Column(name="MusicaId")
	private String musicaId;

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

}
