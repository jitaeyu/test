package report;


public class Market {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seller seller = new Seller(10000,3);
		Custumer custumer = new Custumer(5000);
//		custumer.walletMoney=5000;
		int buy=custumer.buyProduct(3);
		
//		custumer.buyProduct(5);

//		seller.capital=10000;
//		seller.inventory=5;
		seller.sellProduct(buy);
		seller.exitMessige();
		
	}

}
