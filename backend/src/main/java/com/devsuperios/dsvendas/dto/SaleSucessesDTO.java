package com.devsuperios.dsvendas.dto;

import java.io.Serializable;

import com.devsuperios.dsvendas.entities.Seller;

public class SaleSucessesDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Long visited;
	private Long deals;
	
	public SaleSucessesDTO() {
		
	}

	public SaleSucessesDTO(Seller seller, Long visited, Long deals) {
		super();
	    sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}


	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

	 
	
	
	
	
	

}
