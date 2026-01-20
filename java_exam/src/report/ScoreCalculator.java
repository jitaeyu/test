package report;

public class ScoreCalculator {

	public static String computeGrade(int subjA, int subjB, int subjC, int subjD, int subjE) {
		int amount = subjA + subjB + subjC + subjD + subjE;
		double average = calcAverage(amount, 5);

		String grade = calcGrade(average);

		return grade;
	}
	
	public static double calcAverage(int amount, int subjectCount) {
		double average=amount/subjectCount;
		
		
		return average;
	}
	
	public static String calcGrade(double average) {
		String temp;
			
			if(average>=95) {
				temp="A";
			}else if (average>=85) {
				temp="B";
			}else if (average>=75) {
				temp="C";
			}else if (average>=65) {
				temp="D";
			}else{
				temp="F";
			}
			
		return temp;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grage = computeGrade(100, 95, 95, 100, 100);

		System.out.println(grage); // "A"
	}

}
