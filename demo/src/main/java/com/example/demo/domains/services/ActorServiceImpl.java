package com.example.demo.domains.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.domains.entities.Actor;
import com.example.demo.exception.InvalidDataException;
import com.example.demo.exception.NotFoundException;
import com.example.demo.infraestructure.repositories.ActorRepository;

public class ActorServiceImpl {
	@Autowired
	ActorRepository dao;

	public List<Actor> getAll() {
		return dao.findAll();
	}

	public Optional<Actor> get(int id) {
		return dao.findById(id);
	}
	
	public void add(Actor item) throws InvalidDataException {
		if(get(item.getActorId()).isPresent())
			throw new InvalidDataException("Duplicate key");
		dao.save(item);
	}
	public void modify(Actor item) throws NotFoundException {
		if(!get(item.getActorId()).isPresent())
			throw new NotFoundException();
		dao.save(item);
	}
	public void delete(int id) throws NotFoundException {
		if(!get(id).isPresent())
			throw new NotFoundException();
		dao.deleteById(id);
	}
	public void delete(Actor item) throws NotFoundException {
		delete(item.getActorId());
	}
}
