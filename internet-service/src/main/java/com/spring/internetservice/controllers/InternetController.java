package com.spring.internetservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.internetservice.entities.Internet;
import com.spring.internetservice.services.InternetService;

@RestController
@RequestMapping("/internet")
public class InternetController {

	@Autowired
	private InternetService internetService;
	
	@GetMapping
	public ResponseEntity<List<Internet>> getInternetList() {
		List<Internet> internetList = internetService.getAll();
		if(internetList.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(internetList);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Internet> getInternet(@PathVariable("id") int id) {
		Internet internet = internetService.getInternetById(id);
		
		if(internet == null) {
			return ResponseEntity.notFound().build();
		}
				
		return ResponseEntity.ok(internet);
	}
	
	@PostMapping
	public ResponseEntity<Internet> saveInternet(@RequestBody Internet internet) {
		Internet newInternet = internetService.saveInternet(internet);	
		
		return ResponseEntity.ok(newInternet);
	}
	
	
	
	
}
