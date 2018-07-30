package br.com.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.portfolio.models.Projeto;

@Controller
public class ProjetosController {

	@RequestMapping("/projetos/form")
	public String form() {
		return "projetos/form";
	}
	
	@RequestMapping("/projetos")
	public String grava(Projeto projeto) {
		System.out.println(projeto);

		return "projetos/ok";
	}
	
}
