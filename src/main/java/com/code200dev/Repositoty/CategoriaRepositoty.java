package com.code200dev.Repositoty;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.code200dev.Models.Categoria;

public interface CategoriaRepositoty extends MongoRepository<Categoria, String> {
	
}
