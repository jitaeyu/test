package report;

/**
 * 1. 판매하는 모든 상품의 금액은 1000원이다.
 * 2. 판매는 한번에 N개만큼 가능하다
 * 3. 판매(5); 동작 시 재고에서 -5를 실행
 * 4. 판매 시 값의 총합을 자본금에 합해라
 * 5. 판매는 재고 갯수를 넘을수없다.
 * 6. 재고가 없으면 "품절 메시지를 보낸다"
 * 7. 판매작업이 끝이나면 재고,자본금을 출력 후 종료한다.
 * */

public class Seller {
	
	int inventory;//  재고
	int price = 1000;
	int howSell;
	int capital;
	

	
	public void sellProduct(int shoppingBasket) {
		if(inventory<= shoppingBasket) {
			if(inventory<=0) {
				System.out.println("남은 재고가없습니다. 구매할수없습니다.");
			}else {
				howSell=inventory;//재고만큼만판매가능
				System.out.println("재고가 별로없어 "+howSell+"개 만 판매합니다");
				inventory -= howSell;
				sellMessige();
			}
		}else {
			howSell=shoppingBasket;
			inventory-=howSell;
			sellMessige();
		}
		
	}
	
	public void exitMessige() {
		capital =capital+(price*howSell);
		System.out.println("자본금은 : "+ capital +"원 입니다");
		System.out.println("남은 재고는 : "+inventory+"개 입니다");
		System.out.println("판매를 종료합니다");
	}
	
	public void sellMessige() {
		System.out.println("판매개수 : "+howSell+"개" + "판매금액 :" + (howSell*price) +"원 입니다");
		System.out.println("판매를 완료했습니다");
	}
	
}
