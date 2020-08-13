package com.macade.taller8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.macade.taller8.service.PersonService;
import com.macade.taller8.repository.TipoDocReposotory;
@Controller
public class PersonController {
	@Autowired
	TipoDocReposotory tipoDocRepository;
	@Autowired
	PersonService personService;
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/registro")
	public String registro(Model model) {
		model.addAttribute("tipoDocument", tipoDocRepository.findAll());
		return "registro";
	}
}
