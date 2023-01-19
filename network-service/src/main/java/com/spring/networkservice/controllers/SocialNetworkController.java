package com.spring.networkservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.networkservice.entities.SocialNetwork;
import com.spring.networkservice.services.SocialNetworkService;

@RestController
@RequestMapping("/network")
public class SocialNetworkController {
	
	@Autowired
	private SocialNetworkService socialNetworkService;
	
	@GetMapping
	public ResponseEntity<List<SocialNetwork>> getSocialNetworkList() {
		List<SocialNetwork> socialNetworkList = socialNetworkService.getAll();
		if(socialNetworkList.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(socialNetworkList);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<SocialNetwork> getSocialNetwork(@PathVariable("id") int id) {
		SocialNetwork socialNetwork = socialNetworkService.getSocialNetworkById(id);
		if(socialNetwork == null) {
			return ResponseEntity.notFound().build();
		}
				
		return ResponseEntity.ok(socialNetwork);
	}
	
	@PostMapping
	public ResponseEntity<SocialNetwork> saveSocialNetwork(@RequestBody SocialNetwork socialNetwork) {
		SocialNetwork newSocialNetwork = socialNetworkService.saveSocialNetwork(socialNetwork);
		
		return ResponseEntity.ok(newSocialNetwork);		
	}
	
}
