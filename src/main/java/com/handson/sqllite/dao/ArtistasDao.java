package com.handson.sqllite.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.handson.sqllite.domain.Artistas;

public interface ArtistasDao extends PagingAndSortingRepository<Artistas, Long> {

	
}
