package oop;

public class DrinkArray {
	
	Drink[] drinks;
	public DrinkArray(Drink bak, Drink mon, Drink hot, Drink mink) {
		this.drinks = new Drink[4];
		this.drinks[0] = bak;
		this.drinks[1] = mon;
		this.drinks[2] = hot;
		this.drinks[3] = mink;
	}

	public int orderDrink(int drinkId, int quantity) {
		int inv = searchInventory(drinkId);
		if(drinkId<=0 || drinkId >= this.drinks.length) {
			if(inv>quantity) {
				outInventory(drinkId,quantity);
				return drinks[drinkId].price*quantity;
			}else {
				System.out.println("재고가 없습니다");
				return 0;
			}
		}
		return 0;
		
		
//		return int구매금액!!!!;
	}
	
	public void getInventory (int drinkId, int quantity) {
//		if(drinkId<=0 || drinkId >= this.drinks.length){
			drinks[drinkId].inventory +=quantity;
//		}
	}
	public void outInventory(int drinkId, int quantity) {
		if(drinkId<=0 || drinkId >= this.drinks.length) {
			drinks[drinkId].inventory -=quantity;
		}
	}
	
	public int searchInventory(int drinkId) {
		return drinks[drinkId].inventory;
	}
	
}
