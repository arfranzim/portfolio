package br.com.portfolio.models;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Projeto {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String titulo;
	private String descricao;
	private String repositorio;
	
	@ElementCollection(fetch=FetchType.EAGER)
	private List<Tecnologia> tecnologias;
	
	@Override
	public String toString() {
		return "Projeto [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", repositorio=" + repositorio
				+ ", tecnologias=" + tecnologias + "]";
	}
	
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	
	public String getTitulo() { return titulo; }
	public void setTitulo(String titulo) { this.titulo = titulo; }
	
	public String getDescricao() { return descricao; }
	public void setDescricao(String descricao) { this.descricao = descricao; }
	
	public String getRepositorio() { return repositorio; }
	public void setRepositorio(String repositorio) { this.repositorio = repositorio; }

	public List<Tecnologia> getTecnologias() { return tecnologias; }
	public void setTecnologias(List<Tecnologia> tecnologias) { this.tecnologias = tecnologias; }
}
