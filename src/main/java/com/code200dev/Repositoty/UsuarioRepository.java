package com.code200dev.Repositoty;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.code200dev.Models.Usuario;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String> {

}
