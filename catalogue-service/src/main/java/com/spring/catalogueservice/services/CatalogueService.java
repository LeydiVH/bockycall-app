package com.spring.catalogueservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.catalogueservice.entities.Catalogue;
import com.spring.catalogueservice.feignclients.InternetFeignClient;
import com.spring.catalogueservice.feignclients.RechargeFeignClient;
import com.spring.catalogueservice.feignclients.SocialNetworkFeignClient;
import com.spring.catalogueservice.models.Internet;
import com.spring.catalogueservice.models.Recharge;
import com.spring.catalogueservice.models.SocialNetwork;
import com.spring.catalogueservice.repositories.CatalogueRepository;

@Service
public class CatalogueService {
	@Autowired
	private CatalogueRepository catalogueRepository;
	
	@Autowired
	private RechargeFeignClient rechargeFeignClient;
	
	@Autowired
	private InternetFeignClient internetFeignClient;
	
	@Autowired
	private SocialNetworkFeignClient socialNetworkFeignClient;
	
	public List<Catalogue> getAll() {
		return catalogueRepository.findAll();
	}
	
	public Catalogue getCatalogueById(int id) {
		return catalogueRepository.findById(id).orElse(null);
	}
	
	public Catalogue saveCatalogue(Catalogue catalogue) {
		Catalogue newCatalogue = catalogueRepository.save(catalogue);
		
		return newCatalogue;
	}
	
	public List<Recharge> getRechargeList() {
		return rechargeFeignClient.getRechargeList();
	}
	
	public Recharge getRechargeById(int id) {
		return rechargeFeignClient.getRecharge(id);
	}
	
	public List<Internet> getInternetList() {
		return internetFeignClient.getInternetList();
	}
	
	public Internet getInternetById(int id) {
		return internetFeignClient.getInternet(id);
	}
	
	public List<SocialNetwork> getSocialNetworkList() {
		return socialNetworkFeignClient.getSocialNetworkList();
	}
	
	public SocialNetwork getSocialNetworkById(int id) {
		return socialNetworkFeignClient.getSocialNetwork(id);
	}
	
	
}
