package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world") //criando uma porta para o end point 
public class HelloWorldController {

	@GetMapping
	public String helloWorld () { //rota raiz == não recebe nada na rota 
		return "Hello World!";
	}
	
	@GetMapping ("BSM")
	public String bsm() {
		return "BSM Generation Brasil: "
				+ "Persistência"
				+ "Mentalidade de Crescimento "
				+ "Responsabilidade Pessoal "
				+ "Orientação ao Futuro "
				+ "Proatividade"
				+ "Comunicação"
				+ "Trabalho em Equipe "
				+ "Orientação ao Detalhe.";
	}
	
	@GetMapping ("Aprendizagem")
	public String aprendizagem() {
		return "Aprendizagem da semana"
				+ "Trabalho em equipe é que se destaca mais para mim, pois com o PI a conexão que está sendo criada, está sendo uma experiência"
				+ "muito gratificante para mim, o grupo em si se encaixou muito bem e sou muito grata a cada um deles, pois cada um "
				+ "trás um conhecimento diferente que vem para engrandecer a minha experiência";
		
	}
}

