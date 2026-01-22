package report;

import java.util.Random;

/**
 * 1. 한번에 N개만큼 구매가능/
 * 2. 장바구니를 사용해 구매(5); 실행 시 현재 장바구니갯수가 5개로 증가한다
 * 3. 랜덤한 장바구니 들수있는무게를 가지고 시작한다./
 * 4. 상품의 개당 무게는 500g이다/
 * 5. 지갑의 돈보다 많이 상품을 살수없으며, 장바구니무게를 초과하여 살수없다/
 * 6. 구매불가능해지면 그 사유를 출력해라./
 * 7. 프로스를 종료하기전에 구매상품 수, 장바구니무게,지갑의남은돈 출력
 * */
public class Custumer {
	
	int productWeight = 500; 
	int walletMoney;
	int canBasketWeight;
	int wishPurchase;
	
	public Custumer(int walletMoney) {
		this.walletMoney=walletMoney;
	}
	
	public int buyProduct(int howMany) {
		System.out.println(walletMoney);
		int productPay=howMany*1000;
		canBasketWeight=randomBasket();
		System.out.println("구매가능갯수 :"+canBasketWeight);
		if(canBasketWeight>=howMany && walletMoney>=productPay) {
			wishPurchase= howMany;
			walletMoney -= (wishPurchase*1000);
			exitBuymessige();
			return wishPurchase;
		}else {
			if(walletMoney<productPay) {
				System.out.println("보유한 금액이 부족합니다");
			}else {
				System.out.println("들수있는 무게를 초과하였거나.");
			}
		}
		return howMany;
	}
	
	public int randomBasket() {
		Random random = new Random();
		int basketWeight=random.nextInt(5000)+500;
		
		return basketWeight/500;
	}
	
	public void exitBuymessige() {
		System.out.println("-------------------------------------------------");
		System.out.println("구매상품 수 : "+wishPurchase);
		System.out.println("장바구니 가능무게"+(canBasketWeight*500));
		System.out.println("지갑 남은 금액 : "+walletMoney);
		System.out.println("-------------------------------------------------");
		
	}
	
}
