package java11_generic;

import java.util.*;

public class Generic_01_Basic {

	public static void main(String[] args) {
		
		List list = new ArrayList(); //arrraylist 생성
		
		//타입파라미터 E 를 결정하지 않아 Object 로 사용됨
		
		list.add(123);
		list.add("Apple");
		
		System.out.println("------------------");
		
		List<String> list2 = new ArrayList<String>();
		// 타입파라미터 E->String
		
		list2.add("Orange"); //숫자 이런거 안된당
		
		//---------------------------------------------
		
		//타입파라미터로 기본데이터타입 사용불가 -> Wrapper클래스 사용
		
		List<Integer> list3=new ArrayList<>();
		
		list3.add(123);
		
		//---------------------------------------------
		
		//타입 안정성
		// 개발자가 의도한 데이터타이으로만 사용되는 것
		// 타입 파라미터 꼭
		
//		list.add(true); //에러, String만 사용가능
//		list3.add("안녕");//에러, Integer만 사용가능
		
		//-=-------------------------------------------
		
		String str1=(String) list.get(1); //형변환이 필요하다
		
		String str2=list2.get(1); //형변환이 필요없다

		
	}

}


//-1-
//+ 일반화 프로그래밍 ---- 제네릭 이라고 말함
//
//- 자료형을 일반화시켜 프로그래밍하는 것
//
//	int 		=== 일반화 ===>	 데이터타입 T 
//	double
//	float
//	boolean
//	String
//	Point
//	Person
//	...
//
//
//- 자바에서는 제네릭을 이용하여 구현한다
//
//	ex)
//
//	public void out(String var) { }
//	public void out(Integer var) { }
//	public void out(Boolean var) { }
//
//
//	=>	public <T> void out(T var) { } ----- 누가올지는 모르겠다
//			<T> 넣어줘야지 사용가능 이게 제네릭
//
//

//-2-
//+ 제네릭 , Generic
//
//- 클래스 또는 메소드에서 사용되는 다양한 데이터타입을 
//일반화 시켜서 정의하는 방법

//- 코드의 재사용이 높아진다
//
//- 타입 안정성이 제공된다
//		** 타입안정성, Type Safety
//		 객체 또는 메소드가 의도하지 않은 타입으로 사용되는 상황을 방지하는 것 
//		 개발자가 의도한 데이터타입만 사용하도록 제한하는 것 
		
//- 클래스와 메소드에 적용할 수 있다
//
//- 불필요한 형변환을 줄일 수 있다


// + 자주 사용되는 제네릭 타입 파라미터 이름
//  
// 		T - Type
// 		
// 		E - Element
// 		
// 		K - Key
// 		
// 		V - Value
// 		
// 		N - Number






















