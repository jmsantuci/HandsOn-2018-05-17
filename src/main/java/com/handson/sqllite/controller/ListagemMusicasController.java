package com.handson.sqllite.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.handson.sqllite.domain.Musicas;
import com.handson.sqllite.repository.MusicasRepository;

@RestController
@RequestMapping("/api/musicas")
public class ListagemMusicasController {
	
	@Autowired
	private MusicasRepository musicaRepository;
	
	@RequestMapping(value="", method = RequestMethod.GET, consumes = {"application/json"})
	public Collection<Musicas> listagem(@RequestParam(name = "filtro", required = false) String filtro) {
		//TODO		
		return null;
	}
	
	@RequestMapping(value="", method = RequestMethod.GET, consumes = {"application/json"})
	public ResponseEntity<Musicas> findById(@RequestParam(name = "idMusica", required = false) String idMusica) {
		Musicas musicas = musicaRepository.findOne(idMusica);
		return new ResponseEntity<Musicas>(musicas,HttpStatus.OK);
		
	}
}
