package java09_api;

public class MathEx {

	public static void main(String[] args) {
		
		//Math api 
		
		System.out.println(Math.PI);	//원주율
		
		System.out.println(Math.abs(-10)); //절대값
		
		System.out.println(Math.ceil(3.7));	//올림값
		
		System.out.println(Math.floor(3.7)); //내림값
		
		System.out.println(Math.round(-3.7));//반올림
		
		System.out.printf("%.2f",Math.pow(2.1, 3)); //제곱값
		
		
		System.out.println("----------------------------");
		//문제에 나오지 않았던 문제
		System.out.println(Math.max(3.14, 3.14575));
		System.out.println(Math.min(23, 12));
		int n1=11;
		int n2=29;
		
		
		for(int i=Math.min(n1, n2);i<Math.max(n1,n2);i++) {
			
		}
		
		//Math random()
		// 0.0 ~ 1.0 제회 double형 랜덤 숫자 생성
		
		System.out.println("----------------------------");
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		
		System.out.println("----------------------------");
		
		System.out.println((int)(Math.random()*3));//0~4
		System.out.println((int)(Math.random()*5)+20);
//		System.out.println((int)(Math.random()*5));
//		System.out.println((int)(Math.random()*5));
		System.out.println((int)(Math.random()*3)+1);//1은 가위, 2는 바위 3은 보
		
		
	}
	

}

//
//+ Math 클래스
//
//- 수학(산술)적인 연산을 정적메소드로 제공하는 클래스
//
//- 멤버필드로 E(자연상수), PI(원주율) 두 가지를 정적멤버로 가지고 있다
//
//- 사용방법
//	
//	System.out.println( Math.abs(-5) ) //absolute, 절대값
//
//	-> 5
