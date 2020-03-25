package java12_exception;

import java.io.IOException;

class ThrowsEx{
	public char readChar() throws IOException {
		return (char)System.in.read();
		
	}
}

public class Exception_10_throws {

	public static void main(String[] args) {
		
		ThrowsEx te= new ThrowsEx();
		char ch = '\0'; //null문자


		try {
			System.out.println("input character : ");
			ch =te.readChar();
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		System.out.println("output : "+ch);
	
		
		
	}
}

//
//
//+ 데이터타입에 따른 0(영) 처리
//
//		숫자 0 - 숫자로써 수치상 0
//		
//			int num = 0;
//			double d = 0.0;
//			
//		문자 0 - '\0', null 문자
//			
//			char ch1=0;
//			char ch2='\0';
//			
//			문자열의 끝을 나타낸다

		
//		참조값 0 - null포인터 
//				String str= null;
//				참조대상이 없음을 나타낸다 


			

			
			
