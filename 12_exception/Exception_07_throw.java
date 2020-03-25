package java12_exception;

class ThrowTest{
	
	public void print(String str, int num) {
		
		
		if(str==null) {// ㅇㅖ외상황
			throw new NullPointerException(); //예외발생시키기
			
		}
		for(int i=0;i<num;i++) {
			System.out.println(str);
		}
	}
	
}

public class Exception_07_throw {

	public static void main(String[] args) {
		
		
		ThrowTest tt=new ThrowTest();
		
//		tt.print("hi",3); //"hi" 를 3번 출력
//		tt.print(null, 3);
		
		try {
			tt.print(null, 3);
		} catch (NullPointerException e) {
			System.out.println("문자열이 null로 입력됐습니다");
		}
		
	}
}
//
// + 예외를 발생시키기, throw 키워드
// 
//  - 개발자가 직접 예외를 발생시키기 위해 사용하는 키워드
//  
//  - 사용법
//  	
//  		throw 예외객체;
// 
// 		throw new 예외클래스 ();
// 		
// 		
// 		ex)		Exception e = new Exception(); //예외객체생성
// 				throw e; //예외발생
// 				
// 				
// 		ex) 	throw new NullPointerException(); //생성하고 바로 발생시키기
// 		
// 		

 		
 		
