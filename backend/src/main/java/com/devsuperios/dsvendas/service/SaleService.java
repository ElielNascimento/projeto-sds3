package com.devsuperios.dsvendas.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperios.dsvendas.dto.SaleDTO;
import com.devsuperios.dsvendas.dto.SaleSucessesDTO;
import com.devsuperios.dsvendas.dto.SaleSumDTO;
import com.devsuperios.dsvendas.entities.Sale;
import com.devsuperios.dsvendas.repositories.SaleRepository;
import com.devsuperios.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
 
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale>result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x)); 
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupBySeller() {
		return repository.amountGroupedByseller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSucessesDTO> sucessesGroupBySeller() {
		return repository.sucessGroupedBySeller();
}
  
}