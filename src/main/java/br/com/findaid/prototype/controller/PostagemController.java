package br.com.findaid.prototype.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.findaid.prototype.model.Animal;
import br.com.findaid.prototype.model.Postagem;
import br.com.findaid.prototype.model.TipoAnimal;

@Controller
public class PostagemController {

	@RequestMapping("/postagem")
	@ResponseBody
	public List<Postagem> findAll() {
		Postagem postagem1 = new Postagem("Titulo 1", "Mensagem 1", new Animal("Dog 1", new TipoAnimal("Cachorro")));
		Postagem postagem2 = new Postagem("Titulo 2", "Mensagem 2", new Animal("Dog 2", new TipoAnimal("Cachorro")));
		
		return Arrays.asList(postagem1, postagem2);
	}
}
