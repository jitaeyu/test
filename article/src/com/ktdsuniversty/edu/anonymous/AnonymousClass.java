package com.ktdsuniversty.edu.anonymous;

import com.ktdsuniversty.edu.abstractMart.AbstractMart;
import com.ktdsuniversty.edu.abstractMart.Guest;
import com.ktdsuniversty.edu.implement.TV;

public class AnonymousClass {

	public static void main(String[] args) {
		
		//
		AbstractMart mart = new AbstractMart(1500) {

			@Override
			public int usePoint(Guest guest) {
				guest.addPoint(10_000_000);
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void givePoint(Guest guest, int amount) {
				guest.addPoint(amount);
			}

			@Override
			public int discount(Guest guest, int amount) {
				// TODO Auto-generated method stub
				return amount;
			}};
			
			Guest guest = new Guest(0, 0);
			
			mart.sell(guest, 10000, 0);
			
			System.out.println(guest);
			TV emartTV = new TV() {
				
				@Override
				public void turnOn() {
					// TODO Auto-generated method stub
					System.out.println("이마트turnOn ");
				}
				
				@Override
				public void turnOff() {
					// TODO Auto-generated method stub
					System.out.println("이마트 turnOff");
				}
				
				@Override
				public void changeVolumn(int volumn) {
					// TODO Auto-generated method stub
					System.out.println("이마트 changeVolumn");
				}
				
				@Override
				public void changeChannel(int channelNumber) {
					// TODO Auto-generated method stub
					System.out.println("이마트 changeChannel");
				}
			};
			
			
			emartTV.changeChannel(0);
			
			System.out.println(mart);
			System.out.println(emartTV);
	}

}
