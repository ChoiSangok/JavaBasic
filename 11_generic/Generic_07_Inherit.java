package java11_generic;


class Parent<T>{
	
	T data;
	
	
}



class Child01 extends Parent{ // T -> Object
	
	
}

class Child02 extends Parent<String>{ // T -> String
	
	
}

class Child03<K> extends Parent<K>{
	
}

class Child04<M,N> extends Parent<M>{
	N data2;
	
	
	// M data1 : 상속받을 제네릭 M을 이용한 멤버필드, 타입 미결정
	// N data2 : 자식 클래스의 고유한 제네릭 N 멤버필드, 타입 미결정
	
}


public class Generic_07_Inherit { //상속

	public static void main(String[] args) {
		
		
		Child03<Integer> c = new Child03<>(); // T -> K -> Integer
		
		
	}

}
