package java12_exception;

public class Exception_01_Basic {

	public static void main(String[] args) {
		
		int[] arr= new int [5]; //인덱스 : 0~4       인덱스 < 0 , ==4, > 0
		
		int i=0;
		
		while(true) { //무한루프
			
			//예외가 발생하는 이유
			if( i < 0 || i>=arr.length) { //예외처리
				
				System.out.println("[SYSTEM] 인덱스는 "+ arr.length
						+" 보다 작아야 합니다.");
				break;
			}
			
			//i가 5가 될때 인덱스를 벗어나느거 
			arr[i]=i+1; //배열에 값 대입
			
			System.out.println(arr[i]); //배열의 요소 출력
			
			System.out.println("--- "+i+" 번째 완료 --- ");
			i++;
			
			
		}
		
		
		
		
		
		
	}

}

//+ 예외 발생 시 체크사항
//
//1. 예외 클래스 이름( 정보, 계층구조 )
//		ArrayIndexOutOfBoundsException
//		
//		배열의 인덱스를 벗어나서 접근하려고 할 때 발생한다
//		
//		Unchecked Exception
//		
//
//2. 발생 지점
//		at java12_exception.Exception_01_Basic.main(Exception_01_Basic.java:14)
//
//
//3. 에러 메시지
//
//		: 5 //인덱스를 벗어난 수치가 5
