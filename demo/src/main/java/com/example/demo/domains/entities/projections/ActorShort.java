package com.example.demo.domains.entities.projections;

import org.springframework.beans.factory.annotation.Value;

public interface ActorShort {
	int getActorId();
	@Value("#{target.firstName + ' ' + target.lastName}")
	String getName();
}
