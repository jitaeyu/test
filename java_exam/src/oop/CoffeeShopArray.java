package oop;

public class CoffeeShopArray {
	
	Coffee[] drinks;

	public CoffeeShopArray(Coffee hot, Coffee ice, Coffee tea) {
		this.drinks = new Coffee[3];
		this.drinks[0] = hot;
		this.drinks[1] = ice;
		this.drinks[2] = tea;
	}
	
	/**
	 * @param menu 메뉴들의 번호. 1:hot , 2:ice
	 * @param quantity 주문수량
	 * @return 주문가격
	 * */
	
	public int orderCoffee(int menu, int quantity) {
		if(menu <0 || menu >= this.drinks.length) {
			System.out.println("notfound");
			return 0;
		}
		Coffee drink = this.drinks[menu];
		System.out.println(drink.name +"음료를"+quantity+"개 주문");
		return drink.price*quantity;
	}
	
}
