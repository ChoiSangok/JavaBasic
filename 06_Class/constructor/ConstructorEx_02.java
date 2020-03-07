package java06_class.constructor;


class Constructor_02{
	
	private int num1;
	private int num2;
	
	//디폴트생성자
	
	public Constructor_02() {
		
		this(100,200);
		
		System.out.println("디폴트 생성자");
		
		//this. 자기참조 객체
//		this.num1=100;// 구분할려고 멤버필드 강조
//		num2=200;
	}
			
	//매개변수가 int형 하나인 생성자
	//전달인자를 이용해 num1을 초기화 한다
	public Constructor_02(int num1) {
		
		//this 생성자는 가장 위에
		this(num1,600);//this 생성자 호출가장위에 있어야 함
		
		System.out.println("매개변수 1개인 생성자");
		
//		this.num1=num1;
//		this.num2=600;
		
		
		

		
	}
	//매개변수가 2개인 생성자
	//전달인자 2개를 받아 각각 num1, num2로 초기화
	
	public Constructor_02(int num1,int num2) {
		System.out.println("매개변수가 2개인 생성자");
		
//		this.num1=num1;
//		this.num2=num2;
		
		//setter를 이용하여 멤버필드를 초기화 할 수 있다
		setNum1(num1);
		setNum2(num2);
		
		
	}
	
	//모든 변수를 ㅌ출력하는 기능
	
	public void out() { //num1과 num2 출력
		
		System.out.println("num1 : "+ num1+",num2: "+num2);
	}
	
	

	public int getNum1() {	//getter setter
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


public class ConstructorEx_02 {

	public static void main(String[] args) {
		
		
		Constructor_02 cons=new Constructor_02();
		cons.out();
		System.out.println("----------------------------");

		Constructor_02 cons02=new Constructor_02(87);
		cons02.out();
		
		Constructor_02 cons03=new Constructor_02(23,65);
		cons03.out();
		
	}
}


