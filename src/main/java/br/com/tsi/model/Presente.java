package br.com.tsi.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Presente {

	@Id
	private String id;
	private String descricao;
	private float valor;
	private String linkWeb;
	private String idUsuario;
	private int jaGanhei;
	private Date dataGanhei;
	private String nomeComprador;
	
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
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public String getLinkWeb() {
		return linkWeb;
	}
	
	public void setLinkWeb(String linkWeb) {
		this.linkWeb = linkWeb;
	}
	
	public String getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public int getJaGanhei() {
		return jaGanhei;
	}
	
	public void setJaGanhei(int jaGanhei) {
		this.jaGanhei = jaGanhei;
	}
	
	public Date getDataGanhei() {
		return dataGanhei;
	}
	
	public void setDataGanhei(Date dataGanhei) {
		this.dataGanhei = dataGanhei;
	}
	
	public String getNomeComprador() {
		return nomeComprador;
	}
	
	public void setNomeComprador(String nomeComprador) {
		this.nomeComprador = nomeComprador;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Presente other = (Presente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}


	
	
	

