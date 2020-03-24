package java12_exception;

public class Exception_03_try {

	public static void main(String[] args) {
		
		int num1=7;
		int num2=0;
		
		if(num2 !=0 ) {
			System.out.println(num1 / num2);
		} else {
			System.out.println("warning  나눔수가 0입니다 ");
		}
		
		System.out.println("------------------------");
		
		
		try {
			System.out.println(num1 / num2); //예외발생, divide by zero
			
		} catch(ArithmeticException e) {
//			e.printStackTrace(); //예외정보확ㅇ딘 메시지 보이는게 정상~
			
			System.out.println("warning  나눔수가 0입니다 ");
		}
		
		System.out.println("프로그램 정상종료 ");
		
	}
}



