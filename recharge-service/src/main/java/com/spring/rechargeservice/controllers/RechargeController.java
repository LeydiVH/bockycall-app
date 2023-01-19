package com.spring.rechargeservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rechargeservice.entities.Recharge;
import com.spring.rechargeservice.services.RechargeService;

@RestController
@RequestMapping("/recharge")
public class RechargeController {
	
	@Autowired
	private RechargeService rechargeService;
	
	@GetMapping
	public ResponseEntity<List<Recharge>> getRechargeList() {
		List<Recharge> rechargeList = rechargeService.getAll();
		if(rechargeList.isEmpty()) {
			return ResponseEntity.noContent().build();
		} 		
		
		return ResponseEntity.ok(rechargeList);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Recharge> getRecharge(@PathVariable("id") int id) {
		Recharge recharge = rechargeService.getRechargeById(id);
		
		if(recharge == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(recharge);
	}
	
	@PostMapping
	public ResponseEntity<Recharge> saveRecharge(@RequestBody Recharge recharge) {
		Recharge newRecharge = rechargeService.saveRecharge(recharge);
		
		return ResponseEntity.ok(newRecharge);	
	}
	
	
	
}

