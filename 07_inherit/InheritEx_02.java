package java07_inherit;


class Parent2 { //앞에 InheritEx_01ㅇ 있는 parent가 있어서
//	private int num;
//	protected int num; //이럴때 쓰는거 protected
	
	public int num;
	
	
	
	public void display( ) {
		System.out.println("부모메소드");
	}
}


class Child2 extends Parent2{
	
	private int num;
	
	@Override
	public void display() {
		num=100; //private 접근제한자 오버라이딩 된 곳에서도 쓸수없음
		//여기 num은 상속 num인지 child num인지 알수없음ㅇ
		
		System.out.println("오버라이딩 메소드");
	}
}


public class InheritEx_02 {

	public static void main(String[] args) {
		
		Child2 c=new Child2();
		
//		c.num=123; //not visible
		c.display();
		
		
		System.out.println("----------------------");
		
		Parent p = new Parent();
		
		p.display();
	
		
		System.out.println("----------------");
		
		Parent2 pc=new Child2(); //Parent2 <- Child2 부모클래스가 자식클래스를 받아준다.무조건!
		
//		Child2 cp=(Child2) new Parent2(); //Child2 <- Parent2 자식이 부모는 안된다
		//ClassCastException 발생

		pc.display(); //Child2 의 메소드 호출
		
		pc.num=222; //Parent2의 변수 사용


		
		
		
	}

}






















