package java10_collection;

public class ForEachEx {
	
	public static void main(String[] args) {
		
		//foreach 구문
		// for문이 변형된 문법
		// 키워드가 따로 있지 않고, for키워드를 그대로 사용한다
		
//		for([데이터의 각 요소 타입][변수명]:[반복가능한 데이터]) {
//			
//		}
		
		//	ex) 반복가능한 데이터 -> 배열, int[]
		//		데이터의 각 요소타입 ->int
		
		
		int[] arr= {1,2,3,4,5};
		
		for(int num:arr) { //배열의 요소를 하나씩 num에 저장하며 반복
			System.out.print(num+" ");
		}
		
		
	}
	
	

}
