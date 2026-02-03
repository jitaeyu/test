package com.ktdsuniversty.edu.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class FileReadExam {
	
	
	public static void readAndPrintFileDescriptionUseNIO(String parentPath, String file) {
		
//		1.읽으려는 파일의 특징
		File target = new File(parentPath,file);
		
//		2.파일의 내용을 읽는다
//		3.파일의 내용을 list에 할당한다
		try {
			Files.lines(target.toPath());//이거사용하면 메모리를 적게먹는다.
			List<String> lines= Files.readAllLines(target.toPath());
//		4. 파일의 내용을 출력한다.
			for (String line: lines) {
				System.out.println(line);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * 1.8미만버전
	 * */
	public static void readAndPrintFileDescriptionUseIO(String parentPath, String file) {
//		1.읽으려는 파일을 특정
		File target = new File(parentPath,file);
		
//		2. 파일이 존재하는지 확인.
//		3. 읽으려는 대상이 진짜 파일이 맞는지확인.
		if(target.exists() && target.isFile()) {
//			4. 파일의 내용을 읽기 시작
//			4-1. 파일의 바이트를 Chunking 해서 가져온다
			FileReader fileReader = null;

//			4-2. 파일의 내용을 String으로 변환한다.
			BufferedReader bufferdReader = new BufferedReader(fileReader);
			try {
				fileReader =new FileReader(target);
				String line = null;
				while(true) {
					line=bufferdReader.readLine();
					//eof까지 갔느냐
					if(line==null) {
						break;
					}else {
						System.out.println(line);
					}
				}
			} catch (IOException ioe) {
				// TODO Auto-generated catch block
				ioe.printStackTrace();
			} finally {
				if(bufferdReader !=null) {
					try {
						bufferdReader.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(fileReader !=null) {
					try {
						fileReader.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
//			4-3. 내용을 출력한다
			
		}
		

	}

	public static void main(String[] args) {
		Map<String, String> env= System.getenv();
		System.out.println(env);
		System.out.println(env.get("JAVA_HOME"));
		Properties props = System.getProperties();
		System.out.println(props);
		System.out.println(props.get("user.home"));
		String homePath=(String) props.get("user.home");
		//운영체제 정보를 취득하는방법 window와 mac의 환경다를경우 사용
//		실제 개발 시 윈도우로개발 후 리눅스 서버에서 실행시키는경우가많아 필히 알고넘어가야한다
		
		//C:\Java Exam의 정보를 추출
		File directory = new File("C:\\Java Exam");
//		1. 폴더의 이름출력
		String directoryName = directory.getName();
		System.out.println(directoryName);
//		2. 이 경로가 가리키는 것이 파일인지 폴더인지 구분.
		boolean isFile = directory.isFile();
		System.out.println(isFile);
//		isFile의 값이 True이면 파일이고 false이면 파일이 아니다.
		boolean isDirectory = directory.isDirectory();
		System.out.println(isDirectory);
//		3. 이 경로가 실제 존재하는것인지.
		boolean exists= directory.exists();
		System.out.println(exists);
//		exists가 true이면 존재하는 폴더, false이면 존재하지않는폴더
//		4. 이 경로의 크기(실제 폴더의크기)출력
		long bytes=  directory.length();
		System.out.println(bytes);
//		타입이 long인이유는 파일 크기의 기본단위가 byte이기 때문이다
		

		File textFile = new File(homePath+File.separator+"Java Exam", "Java Exam.txt");
		System.out.println(textFile);
		//C:\Java Exam\Java Exam.txt 파일의 정보를 추출.
//		1.파일의 이름을 출력
//		2. 파일이 폴더인지 파일인지 구분해서 출력한다.
//		3. 이 파일이 실제 존재하는 것인지 출력
//		4. 이 파일의 크기를 출력한다
//		5. 이파일이 있는 부모의 경로를 출력한다.
//			5-1
				String parentPath=textFile.getParent();
				System.out.println(parentPath);
//			5-2
				File parentFile= textFile.getParentFile();
				System.out.println(parentFile);
//		6. 이 파일의 경로를 출력한다.
				String textFilePath= textFile.getAbsolutePath();
				System.out.println(textFilePath);
				
//				readAndPrintFileDescriptionUseIO(homePath+ File.separator+"Java Exam", "Java Exam.txt");
				readAndPrintFileDescriptionUseNIO(homePath+ File.separator+"Java Exam", "Java Exam.txt");
		
		
	}
}
