package java05_array;

public class Array_05 {

	public static void main(String[] args) {
		
		//문자열 배열
		// String[]
		// String 배열
		
		
		String[] strArr; //문자열 배열선언
	
		strArr = new String[3]; //배열 생성
		
		// 문자열 배열에 값 대입 			문자열 기본타입
		
		strArr[0] ="Apple";
		strArr[1]= "Banana";
		strArr[2]= "Cherry";
		
		System.out.println("문자열 배열의 길이 : "+strArr.length);
		
		System.out.println("1번째 요소의 길이 : "+strArr[0].length()); //배열의 참조 내용 
		
		System.out.println("==============================");
		
		
		for(int i=0;i<strArr.length;i++) {
			System.out.println(strArr[i]); //배열안에 들어있는 요소
			System.out.println(strArr[i].length()); //배열 안에 들어있는 요소의 길이
			
			System.out.println("----------------");
		}
		
		
		
	}
}





