package java08_abstract.interfaceEx;

public class Child extends Parent implements Inter_01, Inter_02{ //상속, 인터페이스 여러개 

	@Override
	public void out() {
		System.out.println("자식클래스");
	}

}
