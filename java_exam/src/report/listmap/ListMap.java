package report.listmap;

import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class ListMap {
	
	
	public static void Reservation(Map<Integer,List<String>> aircraft) {

		Scanner sc = new Scanner(System.in);
		System.out.println("비행기편위 이름을 입력하면, 좌석 현황을 볼수있습니다.");

		while (true) {
			System.out.println("항공기편의 이름을 입력하세요");
			int getButton = sc.nextInt();
			List<String> aircraftData = aircraft.get(getButton);
			if(!aircraftData.isEmpty()) {
				int i=0;
				for (String data : aircraftData) {
					i++;
					System.out.print(i+" : "+data+"  ");
				}
				System.out.println("좌석을 예약하려면 번호를 입력하세요 예약가능: O, 예약불가능 : X");
				int getbutton2 = sc.nextInt();
				if(aircraftData.get(getbutton2).equals("X")) {
					System.out.println("예약하시겠습니까? 하려면 Y/N");
					if(sc.next().equals("Y")) {
						aircraftData.set(getbutton2, "O");
					}else {
						System.out.println("취소하셨습니다");
					}
				}else {
					System.out.println("예약 불가능한 좌석입니다");
				}
			}else {
				System.out.println("해당 항공편이 없습니다 ");
			}
			if(sc.next().equals("exit")) {
				System.out.println("종료합니다");
				break;
			}
			
			
		}
	}
	
	
	public static void main(String[] args) {
		Map<Integer, List<String>> aircraft = new HashMap<>();
		aircraft.put(0002, new ArrayList<String>());
		aircraft.put(0003, new ArrayList<String>());
		List<String> data = aircraft.get(0002);
		data.add("O");
		data.add("O");
		data.add("O");
		data.add("O");
		data.add("X");
		data.add("O");
		data.add("O");
		data.add("O");
		data.add("O");
		List<String> data2 = aircraft.get(0003);
		data2.add("X");
		data2.add("X");
		data2.add("X");
		data2.add("X");
		data2.add("X");
		data2.add("X");
		data2.add("X");
		data2.add("X");
		data2.add("X");
//		System.out.println(data);
//		System.out.println(aircraft.get(0002));
//		System.out.println(data2);
//		System.out.println(data.get(4));
		Reservation(aircraft);
	}
}
