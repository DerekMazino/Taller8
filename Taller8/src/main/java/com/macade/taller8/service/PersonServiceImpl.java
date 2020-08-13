package com.macade.taller8.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macade.taller8.entity.Persona;
import com.macade.taller8.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	PersonRepository repository;
	
	@Override
	public Iterable<Persona> getAllPersons() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
}
