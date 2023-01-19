package com.spring.rechargeservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rechargeservice.entities.Recharge;
import com.spring.rechargeservice.repositories.RechargeRepository;

@Service
public class RechargeService {
	@Autowired
	private RechargeRepository rechargeRepository;
	
	public List<Recharge> getAll() {
		return rechargeRepository.findAll();
	}
	
	public Recharge getRechargeById(int id) {
		return rechargeRepository.findById(id).orElse(null);
	}
	
	public Recharge saveRecharge(Recharge recharge) {
		Recharge newRecharge = rechargeRepository.save(recharge);
		return newRecharge;
	}
}
