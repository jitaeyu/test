package com.ktdsuniversty.edu.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class FileWriteExam {

	public static void writeFileDescriptionUseNIO(File target, List<String> description) {
		try {
			Files.write(target.toPath(), description);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeFileDescriptionIO(File target, List<String> description) {
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter=null;
		
		try {
			//파일을 쓰기 위한 pipe생성
			fileWriter = new FileWriter(target);
			bufferedWriter = new BufferedWriter(fileWriter);
			//파일 쓰기
			for(String line : description) {
				bufferedWriter.write(line+"\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(bufferedWriter!=null) {
				try {
					bufferedWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fileWriter!=null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Properties props = System.getProperties();
		String homePath=(String) props.get("user.home");
		System.out.println(homePath);
		File file = new File(homePath+File.separator+"Java Exam","Java Exam.txt");
		List<String> description = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			description.add("난수==>"+(Math.random()*10_000));
		}
//		writeFileDescriptionIO(file,description);
		writeFileDescriptionUseNIO(file,description);
	}
}
