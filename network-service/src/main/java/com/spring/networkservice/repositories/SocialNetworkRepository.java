package com.spring.networkservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.networkservice.entities.SocialNetwork;

public interface SocialNetworkRepository extends MongoRepository<SocialNetwork, Integer> {
	
}
