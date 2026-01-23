package com.ktdsuniversty.edu.vendingmachine.item;

public class Drink {
	
	private String name;
	private int price;
	private int inventory;
	
	
	public Drink(String name, int price, int inventory) {
		this.name=name;
		this.price=price;
		this.inventory=inventory;
	}
	

	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public int getInventory() {
		return this.inventory;
	}
	
	public String setName(String name) {
		return this.name;
	}
	public int setPrice(int name) {
		return this.price;
	}
	public int setInventory(int inventory) {
		return this.inventory;
	}
	
	

	
}
