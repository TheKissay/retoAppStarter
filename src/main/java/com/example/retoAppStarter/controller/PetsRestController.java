package com.example.retoAppStarter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pets")
public class PetsRestController {

	
	@GetMapping
	public String showPets() {
		return "Lista de mascotas";
	}
	
	
	
	
}
