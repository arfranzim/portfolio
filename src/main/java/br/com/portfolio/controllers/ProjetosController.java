package br.com.portfolio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.portfolio.daos.ProjetoDAO;
import br.com.portfolio.models.Projeto;

@Controller
@RequestMapping("projetos")
public class ProjetosController {
	
	@Autowired
	ProjetoDAO projetoDao;

	@RequestMapping("/form")
	public ModelAndView form() {
		ModelAndView modelAndView = new ModelAndView("projetos/form");
		modelAndView.addObject("tecnologias", "nome");
		return modelAndView;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView gravar(Projeto projeto, RedirectAttributes redirectAttributes) {
		System.out.println(projeto);
		projetoDao.gravar(projeto);
		redirectAttributes.addFlashAttribute("sucesso", "Projeto cadastrado com sucesso!");
		return new ModelAndView("redirect:projetos");
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listar() {
		List<Projeto> projetos = projetoDao.listar();
		ModelAndView modelAndView = new ModelAndView("projetos/lista");
		modelAndView.addObject("projetos", projetos);
		return modelAndView;
	}
	
}
