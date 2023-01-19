package com.spring.networkservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.networkservice.entities.SocialNetwork;
import com.spring.networkservice.repositories.SocialNetworkRepository;

@Service
public class SocialNetworkService {
	
	@Autowired
	private SocialNetworkRepository socialNetworkRepository;
	
	public List<SocialNetwork> getAll() {
		return socialNetworkRepository.findAll();
	}
	
	public SocialNetwork getSocialNetworkById(int id) {
		return socialNetworkRepository.findById(id).orElse(null);
	}
	
	public SocialNetwork saveSocialNetwork(SocialNetwork socialNetwork) {
		SocialNetwork newSocialNetwork = socialNetworkRepository.save(socialNetwork);
		return newSocialNetwork;
	}
}
