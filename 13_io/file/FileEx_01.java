package java13_io.file;

import java.io.File;

public class FileEx_01 {

	public static void main(String[] args) {
		
		
		//class File
		//	파일 정보를 다루는 클래스
		//	입출력대상으로 사용할 수 있다
		
//		File file1= new File("파일의 경로","파일의 이름");
		File file1= new File("D:/file/","test.txt");
		
		System.out.println("file 1 : "+ file1);
		System.out.println("length : "+ file1.length());
		System.out.println("exists : "+ file1.exists());

		System.out.println("----------------");
		
		File file2= new File("D:/file/","file.txt");
		
		System.out.println("file 2 : "+ file2);
		System.out.println("length : "+ file2.length());
		System.out.println("exists : "+ file2.exists());
	
	}
}
