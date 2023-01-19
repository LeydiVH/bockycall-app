package com.spring.catalogueservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.catalogueservice.entities.Catalogue;

@Repository
public interface CatalogueRepository extends JpaRepository<Catalogue, Integer> {
	
}
