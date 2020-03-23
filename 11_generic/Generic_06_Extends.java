package java11_generic;



public class Generic_06_Extends {

	public static void main(String[] args) {
		
		print(123);			//Integer
		print(23.432);		//Double
		
		//String number 에 안되서 에러
//		print("sangok");	//String 
		
	}
	
	public static <T extends Number> void print(T t) {
		System.out.println(t);
	}

}


// + 제네릭 타입 제한하기
// 
// 		<T> : 어떤 타입 파라미터든지 허용하는 타입 T
// 		
// 		<T extends 부모클래스타입>
// 				지정된 부모클래스타입의 하위클래스들만 허용하는 타입파라미터 T
// 				
// 				
// - 특정 클래스의 하위 클래스로만 타입파라미터를 허용할 수 있도록 
// 제한하고 싶을 때 사용한다
// 
// - 인터페이스로 설정하는 것도 가능하다
// 
// 
// 
// 		ex)		<T extends Number>
// 				-> Byte, Short, Long, Integer, Double, Float ... 타입가능
// 				
// 				-> String, Person, Point 등등 Number와 상속관계가 아닌 타입은 불가능
 				
 				
