package java01_variables;

public class VariablesEx_02 {
	
	public static void main(String[] args) {
		
		// 1. 변수 선언
//		 int형 변수 num 선언하기
		
		//2. 변수에 값 대입
//		 num 변수에 333저장하기
		
		//3. 변수의 값 출력하기
		//Console창에 출력되도록 하기

		int num;
		num = 333;

		System.out.println("num 변수의 값 :" + num);
		
		String alpha;
		alpha = "asdfsadf";
//		char ab;
//		ab = 'a';
		
		System.out.println(alpha);
		
		
		boolean isEmpty;
		isEmpty = true;
		isEmpty = false;
		
		System.out.println(isEmpty);
		System.out.println("논리형 변수의 값 : " + isEmpty + alpha);
		
		int sum,x,y;
		x = 100;
		y = 20;
		sum = x + y;
		
		System.out.println(sum);

	}

}
