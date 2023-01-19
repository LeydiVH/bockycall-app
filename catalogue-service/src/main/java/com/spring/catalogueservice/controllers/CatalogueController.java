package com.spring.catalogueservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.catalogueservice.entities.Catalogue;
import com.spring.catalogueservice.models.Internet;
import com.spring.catalogueservice.models.Recharge;
import com.spring.catalogueservice.models.SocialNetwork;
import com.spring.catalogueservice.services.CatalogueService;

@RestController
@RequestMapping("/catalogue")
public class CatalogueController {
	
	@Autowired
	private CatalogueService catalogueService;

	@CrossOrigin
	@GetMapping
	public ResponseEntity<List<Catalogue>> getAllCatalogue() {
		List<Catalogue> catalogueList = catalogueService.getAll();
		if(catalogueList.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(catalogueList);
	}
	
	@CrossOrigin
	@GetMapping("/{id}")
	public ResponseEntity<Catalogue> getCatalogueById(@PathVariable("id") int id) {
		Catalogue catalogue = catalogueService.getCatalogueById(id);
		if(catalogue == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(catalogue);
	}
	
	@CrossOrigin
	@PostMapping
	public ResponseEntity<Catalogue> saveCatalogue(@RequestBody Catalogue catalogue) {
		Catalogue newCatalogue = catalogueService.saveCatalogue(catalogue);
		
		return ResponseEntity.ok(newCatalogue);
	}
	
	@CrossOrigin
	@GetMapping("/recharge")
	public ResponseEntity<List<Recharge>> getRechargeList() {
		List<Recharge> rechargeList = catalogueService.getRechargeList();
		if(rechargeList.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(rechargeList);
	}
	
	@CrossOrigin
	@GetMapping("/recharge/{id}")
	public ResponseEntity<Recharge> getRechargeById(@PathVariable("id") int id) {
		Recharge recharge = catalogueService.getRechargeById(id);
		if(recharge == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(recharge);
	}
	
	@CrossOrigin
	@GetMapping("/internet")
	public ResponseEntity<List<Internet>> getInternetList() {
		List<Internet> internetList = catalogueService.getInternetList();
		if(internetList.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(internetList);
	}
	
	@CrossOrigin
	@GetMapping("/internet/{id}")
	public ResponseEntity<Internet> getInternetById(@PathVariable("id") int id){
		Internet internet = catalogueService.getInternetById(id);
		if(internet == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(internet);
	}
	
	@CrossOrigin
	@GetMapping("/network")
	public ResponseEntity<List<SocialNetwork>> getSocialNetworkList() {
		List<SocialNetwork> socialNetworkList = catalogueService.getSocialNetworkList();
		if(socialNetworkList == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(socialNetworkList);
	}
	
	@CrossOrigin
	@GetMapping("/network/{id}")
	public ResponseEntity<SocialNetwork> getSocialNetworkById(@PathVariable("id") int id) {
		SocialNetwork socialNetwork = catalogueService.getSocialNetworkById(id);
		if( socialNetwork == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(socialNetwork);
	}
}
