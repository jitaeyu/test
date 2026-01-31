package report.store;

public class MartTest {
/**
 * 단일상품만 취급한다.(간단한 500원 동전넣고 뽑는 뽑기기준으로 다제거후 간단하게만듬.)
 * 상점에서 구매하는것은 모두 한개만 구매하며 얼마를 넣던 한개만나오고
 * 나머지금액은 반환한다
 * 상속받은 서브클래스에서 상위클래스의 값을 super를 통해 사용함으로 상속을 사용하는예제라고 판단.
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mart mart = new Mart("상품", 5000, 10, 10000);
		ConvenienceStore mart2 = new ConvenienceStore("상품A", 5000, 10, 500000);
//		public Mart(String name,int price, int inventory,int inputMoney) {
		DepartmentStore mart3 = new DepartmentStore("상품A", 5000, 10, 500000, 0, 0);
		int a= mart.sell("손님1", 10000);

			mart3.sellDepartmentStore("손님", 30000,1);
			mart3.sellDepartmentStore("손님", 30000,1);

			System.out.println(mart3.getPoint());

			
//			실행결과값예시
//			
//			적립포인트:1500
//			포인트를포함한사용가능금액:31500
//			적립포인트:3000
//			3000


	}

}
