package com.prueba.desarrolloprueba.service;

import org.springframework.stereotype.Service;

import lombok.Data;

@Service
public class PruebaService {
	
	public Object obtenerDatos() {
		return "Prueba de datos";
	}

}
