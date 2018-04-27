package com.handson.sqllite.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public Collection<Musicas> listagem(@RequestParam(name = "filtro", required = false) String filtro) {
		List<Musicas> listaMusicas = musicasRepository.findByArtistaNome(filtro);
		return listaMusicas;
	}
}
