package com.inuvens.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exemplo")
public class ExemploController {
	
	@GetMapping(value = "/{nome}")
	public String Exmplo( @PathVariable("nome") String nome ) {
		
		return "Ola " + nome;
		
	}
	
	
	

}
