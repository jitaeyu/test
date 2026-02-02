package com.ktdsuniversty.edu.generics.collections.list;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversty.edu.vendingmachine.item.Drink;

public class ListExam {
	
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("dasdasdsa");
		names.add("asdsa");
		names.add("dasdsa");
		names.add("dasddsa");
		names.add("dsa");
		names.add("asdsa");
		System.out.println(names);
		String name= null;
		for (int i = 0; i < names.size(); i++) {
			name= names.get(i);
			System.out.println(name);
		}

		int[] arr = new int[] {1, 2, 3};
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		for (int value : arr) {
			System.out.println(value);
		}
		
		for(String value : names) {
			System.out.println(value);
		}
		
		
	}

}
