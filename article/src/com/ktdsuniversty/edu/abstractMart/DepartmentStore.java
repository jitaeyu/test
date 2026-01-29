package com.ktdsuniversty.edu.abstractMart;

public class DepartmentStore extends AbstractMart{

	int amount;
	public DepartmentStore(int productPrice) {
		super(productPrice);
	}

	@Override
	public int usePoint(Guest guest) {
		/**
		 * Guest: Guest is a Guest
		 *  - Vip:VIP is a Guest
		 *  뭘로오든 어차피 맨위에 Guest라 제일 큰 범위부터 차례대로 해야한다 ex) 동물 > 새 > 오리 식으로 비교해야한다.
		 * 
		 * */
		
		
		if(guest instanceof Guest g) {
			guest.addPoint((int)(amount * 0.3));
		}else if(guest instanceof Vip){
			
		}
		return 0;
	}

	@Override
	public void givePoint(Guest guest, int amount) {
		
	}

	@Override
	public int discount(Guest guest, int amount) {
		return 0;
	}

}
