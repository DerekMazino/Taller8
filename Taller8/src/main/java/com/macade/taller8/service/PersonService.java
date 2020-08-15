package com.macade.taller8.service;

import javax.validation.Valid;

import com.macade.taller8.entity.Persona;

public interface PersonService {
	public Iterable<Persona> getAllPersons();

	public Persona createPerson(Persona person) throws Exception;
}
