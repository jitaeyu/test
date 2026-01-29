package report.store;

public class MartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mart mart = new Mart("상품", 5000, 10, 10000);
		ConvenienceStore mart2 = new ConvenienceStore("상품A", 5000, 10, 500000);
//		public Mart(String name,int price, int inventory,int inputMoney) {
		DepartmentStore mart3 = new DepartmentStore("상품A", 5000, 10, 500000, 0, 0);
		int a= mart.sell("손님1", 10000);
//			System.out.println(a);
//			mart2.sellConvenienceStore("손님1", 10000);
			mart2.sellConvenienceStore("손님1", 10000);		
			
			mart2.sellConvenienceStore("손님", 10000);
			mart3.sellDepartmentStore("손님", 10000,2);
//			mart3.sellDepartmentStore("손님A", 30000, 0);
			System.err.println("3333::"+mart3.getPoint());
			
//			mart2.sellConvenienceStore("손님A", 30000);
//			System.out.println(mart2.getPoint());
			

	}

}
