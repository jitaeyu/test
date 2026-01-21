package oop;

public class CraneGameMachine {
	
	boolean insertCoin;
	int dolls;
	
	public void insertCoin() {
		if(dolls<=0) {
			insertCoin=false;
		}else {
			insertCoin=true;	
			System.out.println("정상적으로 코인을 넣었습니다: ");
		}
		
	}
	
	public int doGame() {
		
		double random =(Math.random()*10)%2;
		if(insertCoin) {
			if( (int)random ==1) {
				dolls -= 1;
//				insertCoin=false;
				System.out.println("인형뽑음! 남은 인형 갯수"+dolls+"개");
				return 1;
			}else {
				System.out.println("인형못뽑음! 남은 인형 갯수"+dolls+"개");
				return 0;
			}
		}else {
			System.out.println("plz insertCoin");
		}
		return 0;
		
		
	}

}
