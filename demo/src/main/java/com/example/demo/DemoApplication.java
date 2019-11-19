package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domains.entities.Actor;
import com.example.demo.domains.services.ActorService;
import com.example.demo.exception.NotFoundException;
import com.example.demo.infraestructure.repositories.ActorRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	ActorRepository dao;
	@Autowired
	ActorService srv;

	@Override
	public void run(String... args) {
		System.out.println("Hola mundo");

		// dao.findAll().forEach(item -> System.out.println(item));
		// dao.findTop10ByFirstNameStartingWith("KI").forEach(item ->
		// System.out.println(item.getFilmActors()));
//		Actor actor = new Actor(0, "Pepito", "Grillo");
//		srv.add(actor);
		try {
			Optional<Actor> rslt = srv.get(229);
			if (rslt.isPresent()) {
				Actor actor = rslt.get();
				//actor.setActorId(999);
				actor.setFirstName("PEPITO");
				srv.modify(actor);
			}
			//srv.delete(227);
			srv.getAll().forEach(item -> System.out.println(item));
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
