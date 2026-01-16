package exam;

public class Programmersexam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 3;
		int num2 = 4;
		int sum = num1*num2;
		System.out.println("Q1-1: "+ sum);
		num1=27;
		num2=19;
		sum = num1*num2;
		System.out.println("Q1-2: " + sum);
		
		int age = 40;
		int now = 2022;
		System.out.println("Q2-1: "+(now-age+1));
		age = 23;
		System.out.println("Q2-2: "+ (now-age+1));
		
		num1=2;
		num2=3;
		System.out.println("Q3-1: " + (num1-num2));
		num1 = 100;
		num2 = 2;
		System.out.println("Q3-2: " + (num1-num2));
		
		num1 = 3;
		num2 = 2;
		System.out.println("Q4-1: "+ num1%num2);
		num1 = 10;
		num2 = 5;
		System.out.println("Q4-2: "+ num1%num2);
		
		num1 = 10;
		num2 = 5;
		System.out.println("Q5-1: "+num1/num2);
		num1 = 7;
		num2 = 2;
		System.out.println("Q5-2: " + num1/num2);
		
	}

}
