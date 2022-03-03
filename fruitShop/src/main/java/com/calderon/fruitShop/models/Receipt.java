package com.calderon.fruitShop.models;

import java.util.List;

public class Receipt {

	private double total;
	private List<Product> products;
	private List<Offer> offers;
	
	
	public Receipt() {
		super();
	}
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public List<Product> getProductos() {
		return products;
	}
	public void setProductos(List<Product> productos) {
		this.products = productos;
	}
	public List<Offer> getOffers() {
		return offers;
	}
	public void setOffers(List<Offer> offers) {
		this.offers = offers;
	}
	
	
}
