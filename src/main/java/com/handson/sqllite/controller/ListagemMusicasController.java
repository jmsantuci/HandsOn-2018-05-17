package com.handson.sqllite.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.handson.sqllite.dao.MusicasDao;
import com.handson.sqllite.domain.Musicas;

@RestController
@RequestMapping("/api/musicas")
public class ListagemMusicasController {
	
	@Autowired
	private MusicasDao musicasDao;
	
	@RequestMapping(value="", method = RequestMethod.GET, consumes = {"application/json"})
	public Collection<Musicas> listagem(@RequestParam(name = "filtro", required = false) String filtro) {
		//TODO		
		return null;
	}
	
	@RequestMapping(value="", method = RequestMethod.GET, consumes = {"application/json"})
	public Musicas findById(@RequestParam(name = "idMusica", required = false) String idMusica) {
		try {
			return musicasDao.findOne(Long.valueOf(idMusica));
		}catch (Exception e) {
			return null;
		}
		
	}
}
