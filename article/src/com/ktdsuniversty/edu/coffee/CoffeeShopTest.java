package com.ktdsuniversty.edu.coffee;

public class CoffeeShopTest {

	public static void main(String[] args) {
		Coffee hotCoffee = new Coffee("아메리카노", 4500,100);
		Coffee iceCoffee = new Coffee("아이스티", 4000,60);
//		Coffee tea = new Coffee("캐모마일 티",5000);
		CoffeeShop starBucks = new CoffeeShop(hotCoffee,iceCoffee);
		
		int price = starBucks.orderCoffee(0, 11);
		System.out.println(price);
		
		price = starBucks.orderCoffee(1, 10);
//		System.out.println(price);
		
		
		
	}
	
}