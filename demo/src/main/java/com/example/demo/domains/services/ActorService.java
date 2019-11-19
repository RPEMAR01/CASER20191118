package com.example.demo.domains.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.domains.entities.Actor;
import com.example.demo.exception.InvalidDataException;
import com.example.demo.exception.NotFoundException;

public interface ActorService {

	List<Actor> getAll();

	Optional<Actor> get(int id);

	void add(Actor item) throws InvalidDataException;

	void modify(Actor item) throws NotFoundException;

	void delete(int id) throws NotFoundException;

	void delete(Actor item) throws NotFoundException;

}