package com.code200dev.Repositoty;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.code200dev.Models.Contas;

public interface ContasRepositoty extends MongoRepository<Contas, String> {

}
