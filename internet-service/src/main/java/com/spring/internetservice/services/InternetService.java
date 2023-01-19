package com.spring.internetservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.internetservice.entities.Internet;
import com.spring.internetservice.repositories.InternetRepository;

@Service
public class InternetService {
	
	@Autowired
	private InternetRepository internetRepository;
	
	public List<Internet> getAll() {
		return internetRepository.findAll();
	}
	
	public Internet getInternetById(int id) {
		return internetRepository.findById(id).orElse(null);
	}
	
	public Internet saveInternet(Internet internet) {
		Internet newInternet = internetRepository.save(internet);
		return newInternet;
	}
}
