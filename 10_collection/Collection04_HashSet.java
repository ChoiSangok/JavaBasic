package java10_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collection04_HashSet {
	public static void main(String[] args) {
		
//		Set set=new HashSet(); //순서 유지 안한다.
		
//		Set set=new LinkedHashSet(); //삽입된 순서를 유지한다
		
		Set set=new TreeSet(); //크기 순서대로 정렬 물론 인덱스는 없다 중복제거
		
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		
		System.out.println(set); //순서 상관없이 출력
		
		System.out.println("----------------");
		
		Iterator iter=set.iterator(); //반복자 iterator 생성
		
		
		
		//Set 모든 요소 출력하기
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		System.out.println("-----------------");
		
		
		Object[] arr= set.toArray();// Set -> 배열

		System.out.println(Arrays.toString(arr)); //배열 출력 

		System.out.println();
		
		Arrays.sort(arr); //배열 정렬하기
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("-----------------");
		
		List list=new ArrayList(set);
		
		System.out.println(list);
		
		
		System.out.println("-----------------");
		
		System.out.println("크기: "+set.size());
		System.out.println("비었는가? "+set.isEmpty());
		System.out.println("222가존재하는가? "+set.contains(222));
		System.out.println("30을제거 : "+set.remove(30));
		
		System.out.println();
	
		System.out.println(set);
		
		set.clear();
		
		System.out.println("비었는가? "+set.isEmpty());
		System.out.println(set);
	
		
		
		
	}

}















