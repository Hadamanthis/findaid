package br.com.findaid.prototype.model;

public class TipoAnimal {

	private Long id;
	private String nome;
	
	public TipoAnimal(String nome) {
		this.nome = nome;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
