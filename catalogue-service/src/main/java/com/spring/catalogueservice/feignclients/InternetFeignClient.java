package com.spring.catalogueservice.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.catalogueservice.models.Internet;

@FeignClient(name = "internet-service", url = "http://localhost:8082")
@RequestMapping("/internet")
public interface InternetFeignClient {
	
	@GetMapping
	public List<Internet> getInternetList();
	
	@GetMapping("/{id}")
	public Internet getInternet(@PathVariable("id") int id);
}
