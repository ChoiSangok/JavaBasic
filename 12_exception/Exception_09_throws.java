package java12_exception;

import java.io.IOException;

public class Exception_09_throws {

	public static void main(String[] args){
		
		
		
		System.out.println("input : ");
		
		try {
			//키보드에서 1바이트 받기
			char input=(char) System.in.read();
			
			System.out.println("입력값 : " +input);
			System.out.println("ASCII : " +(int)input);
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}

}

//
// + 예외 떠넘기기, 예외처리 미루기, throws 키워드
//  
// - 사용법
// 		throws 예외클래스명;
// 
// 
// 		[접근제한자][식별자][리턴타입] 메소드명(매개변수) throws 예외클래스{
// 			
// 			//예외발생코드포함작성
// 		}
// 
// 
// - throws가 적용된 메소드를 호출할 때 try - catch 구문을 이용한 예외처리가 필요하다
// 
// - 예외처리를 하지 않으면 대부분 문법에러가 발생한다
// 
// 
// 		
