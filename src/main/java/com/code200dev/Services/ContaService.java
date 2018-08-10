package com.code200dev.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.code200dev.Models.Contas;
import com.code200dev.Repositoty.ContasRepositoty;

public class ContaService {
	@Autowired
	private ContasRepositoty contaRepository;
	
	public Contas findById(String id) {
		Optional<Contas> obj = contaRepository.findById(id);
		return obj.orElse(null);
	}
}
