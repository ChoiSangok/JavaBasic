package java03_scanner;

//외부 패키지에 있는 클래스를 사용할 수 있도록 선언하는 코드

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class ScannerEx_01 {

	public static void main(String[] args) {
		
		int num; //변수 선언
		
		//입력담당 - 현재 쓰레기 값
		
//		@SuppressWarnings("resource")
		Scanner input= new Scanner(System.in); //입력 객체 변수 선언 // input 대입 
		
		System.out.print("문자열을 입력하세요 : ");
		String text= input.nextLine();	//입력한 문자열을 처리하는 메소드 (기능) 
	
		System.out.println("입력한 문자열 " + text);	//입력문자열 확인
		
//		** Scanner ** 
//		Scanner의 주요 기능(메소드)
		
//	***	nextLine(): 문자열 한 줄을 입력받아 String 타입으로 리턴한다.
//		next() : 문자열 한 개를 String 으로 반환
//	***	nextInt() : 입력한 내용 중에서 int형을 찾아서 int 로 반환
//		nextDouble()
//		nextBoolean()
		
		
//		* char 형은 없다

//		* nextLine() 을 이용하여 문자열을 입력받아char 형으로 반환하여 사용
	
		
		
		
	}
}
