package java10_collection;

import java.util.*;

public class ComparatorEx {   
	//중요 ~ ~ ~ ~ ~ ~ ~~ ~ 반환값 인트형 -1 0 1 일때 다 비교 하는법 

	public static void main(String[] args) {
		
		
		Person p1= new Person(2, "Alice", "Swimming");
		Person p2= new Person(1, "Bob", "Soccer");
		Person p3= new Person(3, "Ok", "Golf");
		
		
		
		
		
		List<Person> list=new ArrayList<>();
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		//정렬 전 출력
		for( Person p :list) {
			System.out.println(p);
		}
		
		
		//정렬
		Comparator<Person> comp=new Comparator<Person>() {
	
			//이거 이용해서 비교
			@Override
			public int compare(Person o1, Person o2) {
				
				
				//반환값
				//  음수 : o1의 데이터가 작다 정렬할때 앞으로 보낸다
				//   0 : o1과 o2 의 데이터가 같다 
				//  양수 : o2의 데이터가 크다 정렬할때 뒤로 보낸다

				
				
//				// no 를 기준으로 오름차순 정렬
//				
//				if ( o1.getNo() < o2.getNo() ) {
//					
//					return -1;
//					//음수일때 왼쪽 o1.getNo 앞으로 보냄
//					
//				}else if( o1.getNo()>o2.getNo() ) {
//					
//					return 1;
//					//양수일때 왼쪽 o1.getNo 뒤로 보냄
//					
//				}else {
//
//					return 0;
//				}
				
	
//				// no 를 기준으로 내림차순 정렬
//				if ( o1.getNo() < o2.getNo() ) {
//					
//					return 1;
//					
//					
//				}else if( o1.getNo()>o2.getNo() ) {
//					
//					return -1;
//					
//					
//				}else {
//
//					return 0;
//				}
				
//				//name 기준으로 오름차순
//				
//				if(o1.getName().compareTo(o2.getName()) < 0) {
//					//왼쪽이 작은 경우 ex 5 - 10 = -5
//					
//					return -1;
//				} else if(o1.getName().compareTo(o2.getName()) > 0) {
//					return 1;// 정렬할때 뒤쪽으로 보내기
//					
//				}else {
//					return 0;
//				}	
				
				//name 기준으로 내림차순
				
//				if(o1.getName().compareTo(o2.getName()) < 0) {
//					//왼쪽이 작은 경우 ex 5 - 10 = -5
//					
//					return 1;
//				} else if(o1.getName().compareTo(o2.getName()) > 0) {
//					return -1;// 정렬할때 뒤쪽으로 보내기
//					
//				}else {
//					return 0;
//				}
				
//				//hobby 기준으로 오름차순
//				
//				if(o1.getHobby().compareTo(o2.getHobby()) < 0) {
//					//왼쪽이 작은 경우 ex 5 - 10 = -5
//					
//					return -1;
//				} else if(o1.getName().compareTo(o2.getName()) > 0) {
//					return 1;// 정렬할때 뒤쪽으로 보내기
//					
//				}else {
//					return 0;
//				}
				
				//hobby 기준으로 내림차순
				
				if(o1.getHobby().compareTo(o2.getHobby()) < 0) {
					//왼쪽이 작은 경우 ex 5 - 10 = -5
					
					return 1;
				} else if(o1.getName().compareTo(o2.getName()) > 0) {
					return -1;// 정렬할때 뒤쪽으로 보내기
					
				}else {
					return 0;
				}
				
//				
				
				
			}			
		};
		
		Collections.sort(list,comp);
		
		System.out.println("------");
		
		//정렬후 출력]
		
		for( Person p:list) {
			System.out.println(p);
		}
		
		
	}
	
}






