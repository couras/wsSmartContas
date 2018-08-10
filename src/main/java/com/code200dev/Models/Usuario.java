package com.code200dev.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="usuarios")
public class Usuario {
	
	public Usuario(String id, String usuario, String senha, String email, String situacao, Boolean bloqueado,
			String dataBloqueio) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.senha = senha;
		this.email = email;
		this.situacao = situacao;
		this.bloqueado = bloqueado;
		this.dataBloqueio = dataBloqueio;
	}
	
	@Id
	private String id;
	
	@Indexed(direction = IndexDirection.ASCENDING)
	private String usuario;
	private String senha;
	private String email;
	private String situacao;
	private Boolean bloqueado;
	private String dataBloqueio;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public Boolean getBloqueado() {
		return bloqueado;
	}
	public void setBloqueado(Boolean bloqueado) {
		this.bloqueado = bloqueado;
	}
	public String getDataBloqueio() {
		return dataBloqueio;
	}
	public void setDataBloqueio(String dataBloqueio) {
		this.dataBloqueio = dataBloqueio;
	}
}
