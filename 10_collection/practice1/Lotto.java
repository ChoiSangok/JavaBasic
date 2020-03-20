package java10_collection.practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class Lotto {

	public static void main(String[] args) {
		
		lottoDisplay();
		
		
	}
	
	public static void lottoDisplay() {
		
		Set set=new TreeSet();
		Random ran= new Random(); //랜덤 객체 생성
		

		int i=0;
		
		
		while(set.size()!=6) { //크기로 6개가 될때 
			
			
			int num=ran.nextInt(45)+1;
			
			set.add(num);
			//set.add(ran.nextInt(45)+1);
		
		}
		

		System.out.println(set);
		
		//list로 변환
	
		List list=new ArrayList(set);
		System.out.println(list);
		
		System.out.println("============================");
		
		//방법2
		
		Object[] arr=set.toArray();
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
	}

}
