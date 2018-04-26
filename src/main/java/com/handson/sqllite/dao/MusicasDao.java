package com.handson.sqllite.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.handson.sqllite.domain.Musicas;

public interface MusicasDao extends PagingAndSortingRepository<Musicas, Long> {

	
}
