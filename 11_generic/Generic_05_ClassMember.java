package java11_generic;


class Data<K> {
	
	K data;
	
	
}


class Class05<T>{
	
	Data d1; //Data<K> -> Object
	
	Data<String> d2; //Data<K>-> Data<String>
	
	Data<T> d3; //Data<K>->Data<T>
	
}


public class Generic_05_ClassMember { 
	

	public static void main(String[] args) {
		
		// T -> Integer
		
		Class05<Integer> c05=new Class05<>();
		
		c05.d3.data=100; //NullPointerException    new 안했어~
		
		
		
		//----------------------------
		
		//널포인트 발생하지 않게 하기 위해서는 new 필요
		c05.d1 = new Data<>();  // Data<K> -> Data<Object>
		c05.d2 = new Data<>();  // Data<K> -> Data<String>
		c05.d3 = new Data<>();  // Data<K> -> Data<T> -> Data<Integer>
		
		
		
		
	}
	
}
