package java06_class.constructor;

import java.util.Scanner;

class Constructor { //기능클래스 public -> 에러 
	
	private int num1;
	private int num2=20;
	
	
	public Constructor() { //리턴타이이 없으면 생성자
							//리턴타입이 있으면 메소드
		System.out.println("디폴트 생성자 호출됨");
		
		System.out.println(num1);
		System.out.println(num2);
		
		num1=500;
		num2=600;
		
		System.out.println("--------");
		System.out.println(num1);
		System.out.println(num2);
	}

	//매개변수가 있는 생성자
	
	public Constructor(int num1, int num2) {
		
		System.out.println("매개변수있는 생성자 호출됨");
//		this.num1=num1;
//		this.num2=num2;
		
		setNum1(num1);
		setNum2(num2);
		
		
	}
	
	//일반메소드 - 생성자와 헷갈리니간 절대 이렇게 만들지 말 것!
//	public void Constructor() {
//		//반환값이 void
//		num1=
//	}
	
	
	
	
	public int getNum1() { //알트 쉬프트 에스
		return num1;
	}


	public void setNum1(int num1) {
		this.num1 = num1;
	}


	public int getNum2() {
		return num2;
	}


	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
}





public class ConstructorEx_01 { //실행클래스 --> public 주된 클래스
	public static void main(String[] args) {
		
		Constructor cons= new Constructor();
		System.out.println("--------------------------------------");
		System.out.println("cons : "+cons.getNum1()+","+cons.getNum2());
		
		Constructor cons02 = new Constructor(222,333);
		System.out.println("cons02 : "+cons.getNum1()+","+cons.getNum2());
		
		Scanner sc=new Scanner(System.in);
		
		
		
		
	}
}
