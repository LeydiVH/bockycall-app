package com.spring.internetservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.internetservice.entities.Internet;

@Repository
public interface InternetRepository extends JpaRepository<Internet, Integer>{

}
