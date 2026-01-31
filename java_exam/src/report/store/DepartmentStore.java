package report.store;

public class DepartmentStore extends ConvenienceStore{
	public DepartmentStore(String name, int price, int inventory, int inputMoney, int point, double earnRate) {
		super(name, price, inventory, inputMoney, point, earnRate);
	}
	
	public void sellDepartmentStore(String name ,int buyMoney,int rank) {
	
		if(rank==0) {
			this.earnRate=0.1;
		}else if(rank==1) {
			this.earnRate=0.3;
		}else{
			this.earnRate=0.005;
		}
		super.sellConvenienceStore(name, buyMoney);
		
	}
	
}
