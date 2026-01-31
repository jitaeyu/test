package report.store;

public class ConvenienceStore extends Mart{
	int point;
	double earnRate=0.001;//적립률

	
	
	public ConvenienceStore(String name, int price, int inventory, int inputMoney) {
		super(name, price, inventory, inputMoney);
		// TODO Auto-generated constructor stub
	}
	public ConvenienceStore(String name, int price, int inventory, int inputMoney,int point, double earnRate) {
		super(name, price, inventory, inputMoney);
		this.point=point;
		this.earnRate=earnRate;
	}
	

	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public double getEarnRate() {
		return earnRate;
	}
	public void setEarnRate(double earnRate) {
		this.earnRate = earnRate;
	}
	public void sellConvenienceStore(String name ,int buyMoney) {
		int findPoint = this.getPoint();

		if(this.getPoint()>=100) {

			System.out.println("포인트를포함한사용가능금액:"+ (buyMoney+findPoint));
			int changeon = super.sell(name, (buyMoney+findPoint));
			int changeon2 = super.sell(name, buyMoney);

			this.setPoint(0);
			double earnPoint = (buyMoney-changeon2)*this.earnRate;
			
			this.setPoint((int) earnPoint + findPoint);
			System.out.println("적립포인트:"+this.getPoint());
			
		}else {
			int changeoff = super.sell(name, buyMoney);

			double earnPoint = (buyMoney-changeoff)*this.earnRate;
			this.setPoint((int) earnPoint + findPoint);
			System.out.println("적립포인트:"+this.getPoint());
		}
	}
}
