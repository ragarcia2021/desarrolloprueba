package com.prueba.desarrolloprueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.desarrolloprueba.service.PruebaService;

@RestController
public class PruebaController {
	
	@Autowired
	private PruebaService pruebaService;
	
	@GetMapping("/prueba")
	public Object prueba() {
		return "Hola";
	}
	
	@GetMapping("/obtenerDatos")
	public Object obtenerDatos() {
		return pruebaService.obtenerDatos();
	}

}
