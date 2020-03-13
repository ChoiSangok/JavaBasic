package java08_abstract.interfaceEx;


public class InterfaceEx_02 {

	public static void main(String[] args) {
		
		Child c= new Child();
		c.out();
		
		System.out.println("----------------------");
		
		//extends한 클래스는 부모클래스가 된다
		
		Parent p; //부모클래스 타입 객체 변수
		p= new Child();//부모클래스 <- 자식클래스
		
		p.out(); //자식클래스 메소드 호출(동적바인딩, 인스턴스 확인)
		
		System.out.println("----------------------");
		
		
		// implements한 인터페이스도 부모 타입이 된다
		
		Inter_01 i01; //인터페이스 객체변수 데이터 타입 참조형
		
//		i01=new Inter_01(); //에러나요~ 실체화 불가 추상화이기때문에
		
		i01 = new Child(); //부모인터페이스 <- 자식클래스
		
		i01.out(); //자식클래스의 메소드 호출( 동적바인딩, 인스턴스 확인)
		
		Inter_02 i02=new Child();
		i02.out();
		
		
	}
}

//** 자바는 다중상속 금지~~~~~
//이렇게 쓰면안됌
//class Parent1 {
//	public void out() {
//		System.out.println("부모 1번");
//	}
//}
//
//class Parent2 {
//	public void out() {
//		System.out.println("부모 2번");
//	}
//}
//
//class Children extends Parent1, Parent2 { 
//	
//	//어떤 부모클래스의 out() 을 상속받아야하는지, 호출해야하는지 모호함
//	//자바는 extends를 하나의 클래스만 하도록 만들어져있음
//}










