package com.handson.sqllite.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

}
