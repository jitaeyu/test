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
//		if(rank==0) {
//			this.earnRate=0.1;
//		}else if(rank==2) {
//			this.earnRate=0.3;
//		}else{
//			this.earnRate=0.005;
//		}
		if(this.getPoint()>=100) {

			System.out.println("포인트를포함한사용가능금액:"+ (this.getInputMoney()+findPoint));
			int changeon = super.sell(name, (this.getInputMoney()+findPoint));
			int changeon2 = super.sell(name, this.getInputMoney());

			this.setPoint(0);
			double earnPoint = (super.getInputMoney()-changeon2)*this.earnRate;
			
			this.setPoint((int) earnPoint + findPoint);
			System.out.println("적립포인트:"+this.getPoint());
			
		}else {
			int changeoff = super.sell(name, this.getInputMoney());

			double earnPoint = (super.getInputMoney()-changeoff)*this.earnRate;
			this.setPoint((int) earnPoint + findPoint);
			System.out.println("적립포인트:"+this.getPoint());
		}
		

		
		
//				inputMoney-a;
//		point=earnRate*0.1
//		if(조건) {
//			기본마켓 가져와서 mart.sell 실행? 그럼 기본마켓 갈아내고 확장성있게만들어야함 그거아니면뭐 여러메소드쪼개서 그메소드만쓰는거지
//		}
	}
	
}
