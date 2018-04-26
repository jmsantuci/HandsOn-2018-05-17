package com.handson.sqllite.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.handson.sqllite.domain.Playlists;

public interface PlaylistsDao extends PagingAndSortingRepository<Playlists, Long> {

	
}
