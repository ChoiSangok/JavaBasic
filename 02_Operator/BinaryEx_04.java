package java02_operator;

public class BinaryEx_04 {
	
	public static void main(String[] args) {
		//이항 연산자 - 논리
		// && || !
		//(! 연산자는 단항 연산자)
		
		//&& : AND 			- 두 개의 항이 모두 true 일때 true 리턴
		// || : OR			- 두 개의 항 중 하나라도 true 일때 true 리턴
		// !  : NOT			- 부정연산자 true -> false/ false-> true로 변환
		
		// true && false 
		// false || false 
		
		//------------------------------------------
		
		
		boolean b1=true;
		boolean b2=false;
		
		System.out.println("true && false : "+(b1&&b2));
		System.out.println("true || false : "+(b1||b2));
		System.out.println("!false : " + !b2); //!단항연산자 
		
		System.out.println("================================");
		
		int num=88;
		
		System.out.println( (num>=1)&&(num<=100) ); //관계 연산자로묶을때 
		//num 변수가 1보다 크거나 같은면서 100보다 작거나 같은가
		//변수가 1부터 100까지 숫자인가
		System.out.println("==============================");
		
//		System.out.println(1 <= num <=100);
//		System.out.println(1 <= 88 <=100);
//		System.out.println( true <=100); //여기서 에러
//							boolean / int  이여서 연산이 불가능 !
		
		System.out.println( !((num>=1) && (num<=100)) );		//연산동작	
//		System.out.println( !((88>=1) && (88<=100)) );		
//		System.out.println( !(true && (88<=100)) );		
//		System.out.println( !(true && true) );		
//		System.out.println( !(true) );		
	
	}
}



























