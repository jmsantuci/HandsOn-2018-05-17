package com.handson.sqllite.controller;

import java.util.ArrayList;
import java.util.List;

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
	private MusicasRepository musicasRepository; 
	
	@RequestMapping(value="", method = RequestMethod.GET, consumes = {"application/json"})
	public ResponseEntity<List<Musicas>> listagem(@RequestParam(name = "filtro", required = false) String filtro) {

		List<Musicas> musicas = new ArrayList<>();
		
		if (musicas == null || musicas.isEmpty()) {
			return new ResponseEntity<List<Musicas>>(musicas, HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<List<Musicas>>(musicas, HttpStatus.OK);
	}
	
}
