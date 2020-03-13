package br.com.findaid.prototype.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.findaid.prototype.model.Postagem;

public class PostagemDto {

	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	
	public PostagemDto(Postagem postagem) {
		this.id = postagem.getId();
		this.titulo = postagem.getTitulo();
		this.mensagem = postagem.getMensagem();
		this.dataCriacao = postagem.getDataCriacao();
	}
	
	public Long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public static List<PostagemDto> converter(List<Postagem> postagens) {
		return postagens.stream().map(PostagemDto::new).collect(Collectors.toList());
	}
	
}
