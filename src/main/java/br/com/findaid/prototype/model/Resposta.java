package br.com.findaid.prototype.model;

import java.time.LocalDateTime;

public class Resposta {

	private Long id;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private Boolean solucao = false;
	
	private Postagem postagem;
	private Usuario autor;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public Boolean getSolucao() {
		return solucao;
	}
	public void setSolucao(Boolean solucao) {
		this.solucao = solucao;
	}
	public Postagem getPostagem() {
		return postagem;
	}
	public void setPostagem(Postagem postagem) {
		this.postagem = postagem;
	}
	public Usuario getAutor() {
		return autor;
	}
	public void setAutor(Usuario autor) {
		this.autor = autor;
	}
	
}
