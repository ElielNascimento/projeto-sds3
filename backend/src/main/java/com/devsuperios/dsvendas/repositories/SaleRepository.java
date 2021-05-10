package com.devsuperios.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperios.dsvendas.dto.SaleSucessesDTO;
import com.devsuperios.dsvendas.dto.SaleSumDTO;
import com.devsuperios.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	
	@Query("SELECT new  com.devsuperios.dsvendas.dto.SaleSumDTO(obj.seller,SUM(obj.amount)"
			+ "FROM  sale obj  GROUB obj.seller")
	List<SaleSumDTO> amountGroupedByseller();
	 

	@Query("SELECT new successGroupedBySeller(obj.seller,SUM(obj.visited),)"
			+ "FROM  sale AS obj  GROUP obj.seller")
	List<SaleSucessesDTO> sucessGroupedBySeller();
	
}
  