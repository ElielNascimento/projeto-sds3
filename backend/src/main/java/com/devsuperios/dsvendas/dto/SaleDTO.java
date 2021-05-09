package com.devsuperios.dsvendas.dto;

import java.time.LocalDate;

import com.devsuperios.dsvendas.entities.Sale;

public class SaleDTO {
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	private SellerDTO seller;
	
	public  SaleDTO ( ) {
		
	}

	public SaleDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SellerDTO seller) {
		super();
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}


public SaleDTO(Sale entity) {
    id = entity.getId();
	visited = entity.getVited();
	deals = entity.getDeals();
	amount = entity.getAmount();
	date = entity.getDate();
    seller = new SellerDTO(entity.getSeller());
}

}
