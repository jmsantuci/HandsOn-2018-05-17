package com.handson.sqllite.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.handson.sqllite.domain.Musicas;

@RestController
//@RequestMapping("/{userId}/bookmarks")
//@RequestMapping("/api/musicas")
public class ListagemMusicasController {
	
	
	@RequestMapping(value="/api/musicas", method = RequestMethod.GET, consumes = {"application/json"})
	public Collection<Musicas> listagem(@PathVariable String filtro) {
		//TODO		
		return null;
	}
}
