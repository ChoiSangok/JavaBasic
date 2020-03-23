package java11_generic;


interface Inter1<T1>{
	void method1(T1 data);
}

interface Inter2<T2>{
	void method2(T2 data);
}

class Class08<E> implements Inter1<E>,Inter2<E> {

	@Override
	public void method2(E data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1(E data) {
		// TODO Auto-generated method stub
		
	}



}


public class Generic_08_Inherit {

	public static void main(String[] args) {
		
		
		Class08<String> c = new Class08<>();
		
		c.method1("Apple");
		c.method2("hi");
		
		
	}

}

//
// + 제네릭 클래스, 제네릭 인터페이스 상속하기
// 
//  - 부모클래스 (인터페이스) 의 타입파라미터를 결정하면서 상속해야함
//  
//  - 부모타입에서 타입파라미터를 결정하지 않으면 자식클래스가 타입파라미터를 처리해야한다
//  
//  			-> 타입에 대한 미룰 수 있다
//  			-> 자식클래스에서 지정한 타입파라미터로 사용한다
  			


  			
  



