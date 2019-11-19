package com.example.demo.infraestructure.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domains.entities.Actor;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
	List<Actor> findTop10ByFirstNameStartingWith(String prefijo);
	
	<T> List<T> findByActorIdIsNotNull(Class<T> type);
}
