package java03_scanner;

import java.util.Scanner;

public class ScannerEx_04 {

	public static void main(String[] args) {
		
		//ctrl shift o :import organize ->import 자동으로 지정
		
		Scanner scanner=new Scanner(System.in);
		
		//문자열 입력 처리 메소드
		// nextLine(), next()
		
		String str1;
		String str2;
		
		// 문자열 입력 받기
		System.out.println("문자열을 입력하시오: ");
//		str1=scanner.nextLine();
//		str2=scanner.nextLine();
		str1=scanner.next(); 
		str2=scanner.next();
		
		
		//nextLine() :  개행문자 (엔터키) : 한 줄
		//next() :  공백문자를 기준으로 문자열 구분 (space, tab , enter)
		
//		** 공백문자 ** white space Character
//		- 띄어쓰기		: ' '(ASCII 32) 
//		- 개행, 줄바꿈	: '\n' (ASCII 10)
		// 개행은 운영체제에 따라 '\r' '\n' 를 사용하고 조합 방법이 달라진다.
//		- '\r' : CR, carraige return 
//		- '\n' : LF, line feed, new line
//				윈도우 : '\r''\n' 2byte 사용
//				리눅스 : '\n'	  1byte 사용
//				맥OS   : '\r''\n' 1
//		- 탭, 수평탭 	: '\t' (ASCII 9)
		
		
		System.out.println();
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		
		
	}

}
