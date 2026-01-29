package com.ktdsuniversty.edu.abstractMart;

/**
 * 상속한 클래스가 추상클래스이면서 추상메소드가 존재할경우
 * 추상 메소드를 구현하지않으면 에러가 발생한다.
 * 
 * 해결방법: 
 * 1. 추상메소드를 서브클래스에서 구현한다. --> 추상메소드를 Override한다.
 * 2.서브클레스를 추상클레스로 변환한다(클래스앞에 abstract추가).--> 인스턴스로 생성할수없다
 * 
 * */

public class Mart extends AbstractMart{

	public Mart(int productPrice) {
		super(productPrice);
	}

	@Override
	public int usePoint(Guest guest) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void givePoint(Guest guest, int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int discount(Guest guest, int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
