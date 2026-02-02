package com.ktdsuniversty.edu.generics.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
	public static void printStudents(Map<Integer,List<Student>> classes,int classNum){
			List<Student> students = classes.get(classNum);
				if(students != null) {
					for(Student student:students) {
						System.out.println(classNum+"반의학생: "+student);
					}
		}
	}

	public static void main(String[] args) {
		Map<Integer,List<Student>> classes = new HashMap<Integer, List<Student>>();
		
		
		classes.put(12, new ArrayList<>());
		classes.put(13, new ArrayList<>());
		
		List<Student> student = classes.get(12);
		student.add(new Student(1,"김범수"));
		student.add(new Student(6,"나얼"));
		student.add(new Student(3,"박효신"));
		student.add(new Student(4,"이수"));
		printStudents(classes, 12);
//		System.out.println(classes);
//		System.out.println(classes.size());
//		
//		for (Integer key : classes.keySet()) {
//			System.out.println(classes.get(key));
//			
//		}
		//map은 반복시키지않는다 순서가 일정하지않다 
	}
}
