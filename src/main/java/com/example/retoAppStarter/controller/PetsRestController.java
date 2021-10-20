package com.example.retoAppStarter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pets_library.config.PetsProperties;

@RestController
@RequestMapping("/pets")
public class PetsRestController {

	
	@Autowired PetsProperties s;
	
	
	@GetMapping("/saludo")
	public String getSaludo() {
		System.out.println(s.getLenguaje());
		return s.getLenguaje();
	}
	public String showPets() {
		return "Lista de mascotas";
	}
	
	
	
	
}
