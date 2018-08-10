package com.code200dev.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.code200dev.Enums.EnumSituacao;

@Document(collection="categoria")
public class Categoria {
	
	public Categoria(String id, String descricao, EnumSituacao situacao) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.situacao = situacao;
	}
	
	private String id;
	private String descricao;
	private EnumSituacao situacao;
	
	@Id
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public EnumSituacao getSituacao() {
		return situacao;
	}
	public void setSituacao(EnumSituacao situacao) {
		this.situacao = situacao;
	}
}
