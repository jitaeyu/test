package com.ktdsuniversty.edu.abstractMart;

public class ConvenienceStore extends AbstractMart{
	
	public ConvenienceStore(int productPrice) {
		super(productPrice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int usePoint(Guest guest) {
		int point = guest.getPoint();
		if(point>-100) {
			guest.usePoint(point);
			return point;
		}
		
		
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void givePoint(Guest guest, int amount) {
		// TODO Auto-generated method stub
		int point = (int)(amount * 0.01);
		guest.addPoint(point);
	}

	@Override
	public int discount(Guest guest, int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
