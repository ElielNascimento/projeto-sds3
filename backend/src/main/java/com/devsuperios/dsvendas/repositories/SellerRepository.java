package com.devsuperios.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperios.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

	List<Seller> findAll();
    
	
	
	
	
	
	

}
