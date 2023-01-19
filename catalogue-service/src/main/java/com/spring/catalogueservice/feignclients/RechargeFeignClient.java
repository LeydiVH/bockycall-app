package com.spring.catalogueservice.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.catalogueservice.models.Recharge;

@FeignClient(name = "recharge-service", url = "http://localhost:8081")
@RequestMapping("/recharge")
public interface RechargeFeignClient {
	
	@GetMapping
	public List<Recharge> getRechargeList();
	
	@GetMapping("/{id}")
	public Recharge getRecharge(@PathVariable("id") int id);
}
