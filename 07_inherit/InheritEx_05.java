package java07_inherit;



class Parent5 {
	public void display() {
		
		System.out.println("부모 메소드");
	}
}

//final class child5 extends Parent5 { //상속을 줄 수 없는 클래스 final 붙어서

class Child5 extends Parent5{
	@Override
	public final void display() { //final은 변수, 메소드 , 클래스에 쓸 수 있다
		//final -> 더이상 확장불가능 변경 불가능 끝맺음
		//final 메소드에 넣은며ㅑㄴ 오버라이딩이 불가
		
		System.out.println("자식 클래스 오버라이딩");
	}
}


class GrandChild extends Child5{ //상속만 받고 오버라이딩이 안된당
//	@Override
//	public void display() {
//		System.out.println("2번 재정의된 메소드");
//	}
}


public class InheritEx_05 {

	public static void main(String[] args) {
		
		GrandChild gc = new GrandChild();
		gc.display();
	}

}








