package br.com.findaid.prototype.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.findaid.prototype.controller.dto.PostagemDto;
import br.com.findaid.prototype.model.Animal;
import br.com.findaid.prototype.model.Postagem;
import br.com.findaid.prototype.model.TipoAnimal;

@RestController
public class PostagemController {

	@RequestMapping("/postagens")
	public List<PostagemDto> findAll() {
		Postagem postagem1 = new Postagem("Titulo 1", "Mensagem 1", new Animal("Dog", new TipoAnimal("Cachorro")));
		Postagem postagem2 = new Postagem("Titulo 2", "Mensagem 2", new Animal("Cat", new TipoAnimal("Gato")));
		
		return PostagemDto.converter(Arrays.asList(postagem1, postagem2));
	}
}
