package java13_io.file;

import java.io.File;

public class FileEx_02 {

	public static void main(String[] args) {
		
		
		//절대경로 이용
		// root 디렉토리로부터 파일까지 모든 경로를 다 적은 것
		
		File file1 = new File(
				".\\src\\java13_io\\file", "hello");
		
		System.out.println("file 1 : "+ file1);
		System.out.println("length : "+ file1.length());
		System.out.println("exists : "+ file1.exists());
		
		System.out.println("---------------------");
		
		
		//상대경로 이용 ** 추천 **
		// 클래스패스( Classpath ) 로 부터 파일까지 경로를 적은 것
		
		// ** 클래스 패스, classpath
		//  프로그램이 실행된 위치
		
		// 이클립스에서는 프로젝트 폴더가  클래스패스로 적용되어 있다
		
		File file2 = new File(
				".\\src\\java13_io\\file", "hello");
		
		System.out.println("file 2 : "+ file2);
		System.out.println("length : "+ file2.length());
		System.out.println("exists : "+ file2.exists());
		
		//경로 지정 문자
		
		// . -> 현재 디렉토리
		
		// .. -> 부모 디렉토리
		
		// / -> 루트 디렉토리
		
		//ex ) /test/folder -> D:\test\folder\
		
		//ex)  ./test	-> 프로그램실행폴더/test
		
		//ex) D:/test/folder/../myfolder
//							-> D:\test\myfolder
		
		
		
	}

}


