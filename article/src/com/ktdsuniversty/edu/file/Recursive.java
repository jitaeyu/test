package com.ktdsuniversty.edu.file;

public class Recursive {
	
	public int sumToZero(int start) {
		if(start ==1) {
			return 1;
		}
		return start + sumToZero(start-1);
	}
	
	public void printNumber(int number) {
		System.out.println(number);
		if(number>0) {
			printNumber(number-1);
		}
	}
	
	public void print(int number) {
		System.out.println("출력"+number);
		if(number<3) {
			print(number+1);
			System.out.println(number+"스택을 실행완료했습니다.");
		}
	}

	public static void main(String[] args) {
		Recursive r =  new Recursive();
//		r.print(1);
//		r.printNumber(5);
		int result = r.sumToZero(5);
		System.out.println(result);
	}
}
