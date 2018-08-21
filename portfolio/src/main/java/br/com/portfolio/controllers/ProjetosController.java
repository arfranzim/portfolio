package br.com.portfolio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.portfolio.daos.ProjetoDAO;
import br.com.portfolio.models.Projeto;

@Controller
public class ProjetosController {
	
	@Autowired
	ProjetoDAO projetoDao;

	@RequestMapping("/projetos/form")
	public String form() {
		return "projetos/form";
	}
	
	@RequestMapping("/projetos")
	public String grava(Projeto projeto) {
		System.out.println(projeto);
		projetoDao.gravar(projeto);
		return "projetos/ok";
	}
	
}
