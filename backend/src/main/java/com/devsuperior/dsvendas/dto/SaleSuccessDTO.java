package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String salesName;
	private Long visited;
	private Long deals;

	public SaleSuccessDTO() {

	}

	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		// super();
		salesName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public String getSalesName() {
		return salesName;
	}

	public void setSalesName(String salesName) {
		this.salesName = salesName;
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
