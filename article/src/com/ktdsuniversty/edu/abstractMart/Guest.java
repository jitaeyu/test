package com.ktdsuniversty.edu.abstractMart;

public class Guest {
	private int money;
	private int point;
	

	public int getPoint() {
		return this.point;
	}
	public void usePoint(int point) {
		this.point -=point;
	}
	public void addPoint(int point) {
		this.point +=point;
	}
	
	
	public Guest(int money,int point) {
		this.money=money;
		this.point=point;
	}
	
	public void pay(int amount) {
		this.money=amount;
	}
	
	public void giveMoney(int remainMoney) {
		this.money+= remainMoney;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "고객남은돈:"+this.money;
	}
}
