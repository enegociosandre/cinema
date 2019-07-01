package br.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.cinema.dao.FilmeDao;
import br.cinema.model.Filme;

@Controller
public class FilmeController {
	
	@Autowired
	private FilmeDao filmeDao;
	
	@GetMapping({"/admin/filme"})
	public ModelAndView form (Filme filme){
		ModelAndView modelAndView = new ModelAndView("filme/filme");
		modelAndView.addObject("filme", filme);
		return modelAndView;
	}
	
	@GetMapping(value="admin/filmes")
	public ModelAndView lista() {
		ModelAndView modelAndView = new ModelAndView("filme/lista");
		modelAndView.addObject("filmes",filmeDao.findAll());
		return modelAndView;
	}
	
	

}
