package br.com.findaid.prototype.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Postagem {

	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private StatusPostagem status = StatusPostagem.NAO_RESPONDIDO;
	
	private Animal animal;
	private List<Foto> fotos;
	private List<Resposta> respostas = new ArrayList<>();
	private Usuario autor;
	
	public Postagem(String titulo, String mensagem, Animal animal) {
		super();
		this.titulo = titulo;
		this.mensagem = mensagem;
		this.animal = animal;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
	public StatusPostagem getStatus() {
		return status;
	}
	public void setStatus(StatusPostagem status) {
		this.status = status;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	public List<Foto> getFotos() {
		return fotos;
	}
	public void setFotos(List<Foto> fotos) {
		this.fotos = fotos;
	}
	public List<Resposta> getRespostas() {
		return respostas;
	}
	public void setRespostas(List<Resposta> respostas) {
		this.respostas = respostas;
	}
	public Usuario getAutor() {
		return autor;
	}
	public void setAutor(Usuario autor) {
		this.autor = autor;
	}
	
}
