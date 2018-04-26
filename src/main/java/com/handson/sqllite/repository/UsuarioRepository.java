package com.handson.sqllite.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.handson.sqllite.domain.Playlists;
import com.handson.sqllite.domain.Usuarios;

public interface UsuarioRepository extends JpaRepository<Usuarios, String> {
	
	public List<Playlists> findByNome(String nome);

}
