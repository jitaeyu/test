package oop;

public class CoffeeShopTest {

	public static void main(String[] args) {
		Coffee hotCoffee = new Coffee("아메리카노", 4500);
		Coffee iceCoffee = new Coffee("아이스티", 4000);
		Coffee tea = new Coffee("캐모마일 티",5000);
		CoffeeShopArray starBucks = new CoffeeShopArray(hotCoffee,iceCoffee,tea);
		
		int price = starBucks.orderCoffee(1, 3);
		System.out.println(price);
		
		price = starBucks.orderCoffee(0, 10);
		System.out.println(price);
	}
}
