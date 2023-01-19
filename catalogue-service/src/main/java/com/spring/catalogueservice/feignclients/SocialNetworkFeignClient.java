package com.spring.catalogueservice.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.catalogueservice.models.SocialNetwork;

@FeignClient(name = "social-network-service", url = "http://localhost:8083")
@RequestMapping("/network")
public interface SocialNetworkFeignClient {
	
	@GetMapping
	public List<SocialNetwork> getSocialNetworkList();
	
	@GetMapping("/{id}")
	public SocialNetwork getSocialNetwork(@PathVariable("id") int id);
}
