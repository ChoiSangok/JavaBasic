package java11_generic;

import java.util.*;




public class Generic_09_Wildcard {
							//제네릭에서 ? 은 와일드 카드
	
	public static void display(List<?> list) { //매개변수 List Integer와 String 을 모두 받아들일수있는 <>
	
//	public static void display(List<? extends Number> list) { //숫자만 허용하는 메소드
	
//	public static void display(List<? super String> list) {
		
		for( Object o: list) {
			System.out.println(o);
		}
	}
	
	
	

	public static void main(String[] args) {
		
		
		List<Integer> iList=Arrays.asList(10,20,30);
		
		display(iList);
		
		System.out.println("------------------");
		
		
		List<String> sList=Arrays.asList("A","B","C");
		
		display(sList);
		
		System.out.println("------------------");
		
		Object o = null;
		Integer i = null;
		
		o = i; //Object 클래스는 Integer 의 부모클래스
		
		
		System.out.println("------------------");
		
		//제네릭은 자바의 기본 상속구조를 무시한다
		
		List<Object> ol=null;
		List<Integer> il=null;
		
//		ol=il; // 에러발생
		
		
		
		
	}

}







//+ 와일드 카드, Wildcard - ? -
//
//- 타입 파라미터에서 어떤 타입으로든 사용가능하도록 지정되는 제네릭
//
//- 		<?> : 제한 없이 어떤 타입파라미터로든지 사용할 수 있음 ( 안 좋음 )

//
//			<? extends 상위타입>
//					지정한 상위타입의 하위클래스로만 사용할 수 있는 타입파라미터
//			
//			<? super 하위타입>
//					지정한 하위타입의 상위클래스로만 사용할 수 있는 타입파라미터
//			






