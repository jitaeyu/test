package report.store;


public class Mart {

	private String name;
	private int price;
	private int inventory;
	private int pocketMoney;
	
//	}
	public Mart(String name,int price, int inventory,int inputMoney) {
		this.name=name;
		this.price=price;
		this.inventory=inventory;
		this.pocketMoney=inputMoney;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getInventory() {
		return inventory;
	}



	public void setInventory(int inventory) {
		this.inventory = inventory;
	}



	public int getPocketMoney() {
		return pocketMoney;
	}



	public void setPocketMoney(int pocketMoney) {
		this.pocketMoney = pocketMoney;
	}



	public int sell(String name, int buymoney) {
//		mart.setInputMoney(inputMoney);
		
		if(this.getInventory()>0) {
			//구매가능
			if(buymoney>=this.getPrice()) {
				//구매가능
				this.setInventory(this.getInventory()-1);//팔았다
				int pay = this.getPrice();
//				System.out.println("판매상품명: "+this.name+" \n판매금: "+pay);
				int sum=buymoney - this.getPrice(); // 거스름돈 계산

//				System.out.println("거스름돈:"+sum);
				return sum;
				
			}else {
				System.out.println("그돈으론 아무것도 못사요");
			}
		}else {
			System.out.println("재고부족");
		}
		return 0;
	}
	
	

}
