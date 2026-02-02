package com.ktdsuniversty.edu.generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ScoreListTest {

	public static void main(String[] args) {
		ScoreList<Integer,Integer> list = new ScoreList<>();
		list.add(1111);
		list.add(2222);
		list.add(3333);
		list.add(4444);
		list.add(5555);
		list.add(6666);
		list.add(7777);
		
//		int sum=0;
//		for (int i = 0; i<6; i++) {
//			sum+=list.get(i);
//		}
		Reducer<Integer, Integer> listReducer = new Reducer<>() {

			@Override
			public Integer reduce(Integer input, Integer output) {
				output += input;
				return output;
			}
		};
		
		int sum = list.sum(listReducer, 0);
		System.out.println("sum = "+sum);
		
//		int value = list.get(0);
//		System.out.println(value);
		
		ScoreList<String,String> list2 = new ScoreList<>();
		list2.add("fssa");
		list2.add("fasda");
		list2.add("Sdasdsa");
		
//		String concat ="";
//		for (int i = 0; i<2; i++) {
//			concat +=list2.get(i);
//		}
//		System.out.println(concat);
		
		
		ScoreList<String[],String> arrayList = new ScoreList<>();
		arrayList.add(new String[] {"asddas","ewqew"});
		arrayList.add(new String[] {"fss","ww"});
		arrayList.add(new String[] {"rrr","aszd"});
		
//		String[] arrayValue = arrayList.get(2);
//		System.out.println(Arrays.toString(arrayValue));

		
		Reducer<String[], String> arrayReducer = new Reducer<>() {
			
			@Override
			public String reduce(String[] input, String output) {
				for (int i = 0; i < input.length; i++) {
					output += input[i];
				}
				return output;
			}
		};

		String arrayResult = arrayList.sum(arrayReducer, "");

		System.out.println(arrayResult);
		
	}
}
