package com.code200dev.Models;

import java.util.List;

import org.json.JSONArray;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.code200dev.Enums.EnumSituacao;


@Document(collection="contas")
public class Contas {
	
	public Contas(String id, Usuario usuario, EnumSituacao situacao, String parcelado, int qtdeParcelas,
			List<Parcelas> parcelas) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.situacao = situacao;
		this.parcelado = parcelado;
		this.qtdeParcelas = qtdeParcelas;
		this.parcelas = parcelas;
	}
	
	@Id
	private String id;
	private Usuario usuario;
	private EnumSituacao situacao;
	private String parcelado;
	private int qtdeParcelas;
	private List<Parcelas> parcelas;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public EnumSituacao getSituacao() {
		return situacao;
	}
	public void setSituacao(EnumSituacao situacao) {
		this.situacao = situacao;
	}
	public String getParcelado() {
		return parcelado;
	}
	public void setParcelado(String parcelado) {
		this.parcelado = parcelado;
	}
	public int getQtdeParcelas() {
		return qtdeParcelas;
	}
	public void setQtdeParcelas(int qtdeParcelas) {
		this.qtdeParcelas = qtdeParcelas;
	}
	public List<Parcelas> getParcelas() {
		return parcelas;
	}
	public void setParcelas(List<Parcelas> parcelas) {
		this.parcelas = parcelas;
	}
}
