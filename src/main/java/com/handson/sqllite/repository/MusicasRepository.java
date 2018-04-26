package com.handson.sqllite.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.handson.sqllite.domain.Musicas;


public interface MusicasRepository extends JpaRepository<Musicas, String>{
	
	public List<Musicas> findByArtistaNome(String nome);
	
}
