package com.macade.taller8.service;

import java.util.Optional;

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
	private boolean checkUsernameAvaliable(Persona person) throws Exception{
		Optional <Persona> userFound =  repository.findByUsername(person.getUsername());
		if(userFound.isPresent()) {
			throw new Exception("Username no disponible");
		}
		return true;
	}
	
	private boolean checkPasswordValid(Persona person) throws Exception{
		if(!person.getPassword().equals(person.getConfirmPassword())) {
			throw new Exception("Las contraseñas no coinciden");
		}
		return  true;
	}
	@Override
	public Persona createPerson(Persona person) throws Exception {
		// TODO Auto-generated method stub
		if(checkUsernameAvaliable(person) && checkPasswordValid(person)) {
			person = repository.save(person);
		}
		return person;
	}
	
}
