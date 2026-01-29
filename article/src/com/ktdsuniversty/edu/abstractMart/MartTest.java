package com.ktdsuniversty.edu.abstractMart;

public class MartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int point = 1_000_000;
		int usePorint = (int)(Math.random()*point+1);
		
		Guest guest = new Guest(200000,0);
		Guest guest2 = new Vip(7000,300);
		Guest guest3 = new VVIP(0,12000);
		
		
//		AbstractMart mart = new Mart(1500);

//		AbstractMart mart = new ConvenienceStore(1500);

		AbstractMart mart = new DepartmentStore(1500);
		mart.sell(guest, 5, 10000);
		mart.sell(guest2, 5, 7000);
		mart.sell(guest3, 5, 0);
		
		System.out.println(guest);

		System.out.println(guest2);

		System.out.println(guest3);
	}

}
