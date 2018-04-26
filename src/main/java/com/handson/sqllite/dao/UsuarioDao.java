package com.handson.sqllite.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.handson.sqllite.domain.Usuarios;

public interface UsuarioDao extends PagingAndSortingRepository<Usuarios, Long> {

	
}
