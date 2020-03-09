package java07_inherit;


class Parent{
	String name;
	int num;
		

	public void display() { //parent display
		System.out.println("부모클래스의 메소드");
	}
}
	

class Child extends Parent{ //자기꺼랑 부모꺼랑
	

	int score;
	
	public void print() {
		System.out.println("자식 클래스의 메소드");
	}
	
	public void display() { //child display 같은걸 쓸려면 오버로딩 매개변수가 있던가 차이가 있어야
		System.out.println("매소드 재정의, 오버라이딩");
		//기존의 있는걸 바꾸는 느낌
	}
}


public class InheritEx_01{

	public static void main(String[] args) {

		Parent p= new Parent();
		
		p.name="Alice";
		p.num=123;
		
		p.display();
		System.out.println("------------------");
		
		Child c= new Child();
		
		c.name="bob";
		c.num=444;
		c.score=555;
		
		c.display();
		c.print();
		
	}
}


