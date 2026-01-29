package com.ktdsuniversty.edu.abstractMart;
/**
 *  public class Name : 인스턴스로 생성할수있는 일반클래스정의
 *  public abstract class Name : 인스턴스로 생성할수없는 추상클래스 정의
 * */
public abstract class AbstractMart {
	private int safe;
	private int productPrice;

	private int remainMoney;	//고객에게 거슬러줄돈
	
	public AbstractMart(int productPrice) {
		this.productPrice=productPrice;
	}
	
	public void sell(Guest guest, int sellCount,int money) {
		this.remainMoney=money;
		this.safe += money - this.remainMoney;
		int guestPoint = this.usePoint(guest);
		int amount = sellCount*this.productPrice;
		amount -= this.discount(guest, amount);
		
		
		if(money+guestPoint< amount) {
			System.out.println("돈이모자르다 구매가격:"+amount+"손님이낸돈:"+money);
			return;
		}
		//손님이 마트에 돈을 지불한다
		guest.pay(money);
		
		this.givePoint(guest,amount);
		

		if(amount > guestPoint) {
			this.remainMoney -=amount-guestPoint;
			
		}
//		System.out.println("거슬러준돈:"+this.productPrice);
		System.out.println("매출액"+amount);
		System.out.println("거슬러줄돈"+this.remainMoney);
		
		
		guest.giveMoney(this.remainMoney);//마트가 손님에게 거슬러준다
		this.remainMoney=0;
	}
	
	public abstract int usePoint(Guest guest);
	
	public abstract void givePoint(Guest guest,int amount);
	
	public abstract int discount(Guest guest, int amount);
}
