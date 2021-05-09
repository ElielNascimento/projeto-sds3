package com.devsuperios.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperios.dsvendas.dto.SellerDTO;
import com.devsuperios.dsvendas.service.SellerService;

@RestController
@RequestMapping(value= "/sellers")
public class SellerControllerr {
	
	
   @Autowired
	private SellerService  service;
   
   public ResponseEntity< List<SellerDTO>> findAll(){
	   
	   List<SellerDTO> list = service.findAll();
	   return ResponseEntity.ok(list);
   }
	
}