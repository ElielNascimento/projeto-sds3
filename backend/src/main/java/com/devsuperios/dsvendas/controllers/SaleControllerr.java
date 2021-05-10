package com.devsuperios.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperios.dsvendas.dto.SaleDTO;
import com.devsuperios.dsvendas.dto.SaleSucessesDTO;
import com.devsuperios.dsvendas.dto.SaleSumDTO;
import com.devsuperios.dsvendas.service.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleControllerr {
	
	
   @Autowired
	private SaleService  service;
   
    @GetMapping
   public ResponseEntity< Page<SaleDTO>> findAll(Pageable pageable){ 
	 Page<SaleDTO> list = service.findAll(pageable);
	   return ResponseEntity.ok(list);
   }
	
    @GetMapping(value = "/amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupBySeller() { 
 	 List<SaleSumDTO> list = service.amountGroupBySeller() ;
 	   return ResponseEntity.ok(list);
}
    
    
    @GetMapping(value = "/sucesses-by-seller")
    public ResponseEntity<List<SaleSucessesDTO>> sucessesGroupBySeller() { 
 	 List<SaleSucessesDTO> list = service.sucessesGroupBySeller() ;
 	   return ResponseEntity.ok(list);

    
} 
    
}