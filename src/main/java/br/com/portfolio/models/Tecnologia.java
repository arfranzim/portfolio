package br.com.portfolio.models;

import javax.persistence.Embeddable;

@Embeddable
public class Tecnologia {

	private String nome;

	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
}
