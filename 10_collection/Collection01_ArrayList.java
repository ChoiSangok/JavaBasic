package java10_collection;

import java.util.ArrayList;
import java.util.List;

public class Collection01_ArrayList { //단순연결리스트   동기화 되지 않음

	public static void main(String[] args) {
		
		List list=new ArrayList();
		
		//자료구조에서 자주 사용되는 동작(로직, 알고리즘) 
		
		//	CRUD 작업
		
		//	Create	- 추가/삽입
		//	Read	- 조회/탐색
		//	Update	- 수정/변경
		// 	Delete	- 삭제/제거
		
		System.out.println("\n----삽입----");
		
		list.add("Apple");	//인덱스 자동부여
		list.add("Banana");
		list.add("Cherry");
		
		System.out.println(list);
		
		System.out.println("\n----조회----");
		
		System.out.println(list.get(1)); //Banana
		
		System.out.println("-----");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("\n----수정----");
		//인덱스 1번자리 orange
		list.set(1, "Orange");
		
		System.out.println(list);
		
		System.out.println("\n----삭제----");
		
		System.out.println(list.remove("Banana")); //false
		
		System.out.println(list);
		System.out.println("지워진값 : "+list.remove(1));
		System.out.println(list);
		
		System.out.println("\n----삽입----");
		list.add("Tomato");
		
		System.out.println(list);
		
		System.out.println("\n----contain()----"); //포함관계
		System.out.println(list.contains("Tomato"));
		
		System.out.println("\n----isEmpty()----"); //매개변수 없이
		System.out.println(list.isEmpty());
		
		System.out.println("--------");
		
		List l=null;	//리스트를 생성하지 않음
		
		
//		if(l.isEmpty()) {} //.NullPointerException
		
//		if(l==null) { }//정상, 리스트를 생성하지 않았는지 검사
		List ll=new ArrayList(); //요소를 넣지 않음
		
//		if(ll.isEmpty()) {} //정상, 요소가 하나도 없는지 검사
		
		if(ll==null) { } //정상, 리스트를 생성하지 않았는지 검사
		
		System.out.println(l); //null
		System.out.println(ll);//[]
		
		System.out.println("\n----모든 요소 출력하기----");
		
		list.add(123);
		list.add(true);
		list.add(3.14);
		System.out.println(list); //1. 객체를 이용한 출력
		// list는 다른 타입들도 모아서 쓸 수 있음
		//배열 다른점은 배열은 하나의 타입만으로 만들수있음
		
		System.out.println("--------");
		
		for(int i=0;i<list.size();i++) {	//2. for문을 이용한 출력
			System.out.println(list.get(i));
		}
		
		System.out.println("--------");
		
		for(Object element : list) { //3. foreach문을 이용한 출력
			System.out.println(element);
		}
		
		System.out.println("\n----clear()----"); //전체 요소 삭제 
		
		System.out.println(list);
		
		list.clear();
		
		System.out.println(list);
		
		list=null;		//객체 삭제(GC 동작)
		
		
	}
	

}

