package com.acme.ecommerce.warehouse.stocks;

public class ProductStock {

	private final int id;
	private final boolean available;

	public ProductStock(int id, boolean available) {
		this.id = id;
		this.available = available;
	}

	@SuppressWarnings("unused")
	public int getId() {
		return id;
	}

	@SuppressWarnings("unused")
	public boolean isAvailable() {
		return available;
	}
}
