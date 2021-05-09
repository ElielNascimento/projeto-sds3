package com.devsuperios.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperios.dsvendas.dto.SaleDTO;
import com.devsuperios.dsvendas.dto.SellerDTO;
import com.devsuperios.dsvendas.entities.Sale;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	public List<SaleDTO> findAll(){
		List<Sale>result = repository.findAll();
		return result.stream().map(x -> new SaleDTO(x)).collect(Collectors.toList());
	}
 
}
 