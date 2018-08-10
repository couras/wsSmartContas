package com.code200dev.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.code200dev.Enums.EnumSituacao;

@Document(collection="parcelas")
public class Parcelas {
	
	public Parcelas(String id, String valor, String vencimento, EnumSituacao situacao) {
		super();
		this.id = id;
		this.valor = valor;
		this.vencimento = vencimento;
		this.situacao = situacao;
	}
	
	@Id
	private String id;
	private String valor;
	private String vencimento;
	private EnumSituacao situacao;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getVencimento() {
		return vencimento;
	}
	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}
	public EnumSituacao getSituacao() {
		return situacao;
	}
	public void setSituacao(EnumSituacao situacao) {
		this.situacao = situacao;
	}
	
}
