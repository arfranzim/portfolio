package br.com.portfolio.models;

public class Projeto {

	private String titulo;
	private String descricao;
	private String codigo;
	
	@Override
	public String toString() {
		return "Projeto [titulo=" + titulo + ", descricao=" + descricao + ", codigo=" + codigo + "]";
	}
	
	public String getTitulo() { return titulo; }
	public void setTitulo(String titulo) { this.titulo = titulo; }
	
	public String getDescricao() { return descricao; }
	public void setDescricao(String descricao) { this.descricao = descricao; }
	
	public String getCodigo() { return codigo; }
	public void setCodigo(String codigo) { this.codigo = codigo; }
}
