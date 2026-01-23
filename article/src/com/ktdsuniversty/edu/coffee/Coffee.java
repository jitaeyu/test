package com.ktdsuniversty.edu.coffee;

public class Coffee {
	
	private String name;
	private int price;
	private int stock;
	
	public Coffee(String name,int price,int stock){
		this.name=name;
		this.price=price;
		this.stock=stock;
	}
	
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public int getStrock() {
		return this.stock;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setStock(int stock) {
		this.stock=stock;
	}
}
