package java05_array;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class Array_04 {
	public static void main(String[] args) {
		
		//문자열, string
		// char형들의 집합인 char[] 의 개념을 사용한다,.
		
		String str="Apple"; //문자열
		char[] chArr= {'A','p','p','l','e'}; //char형 배열
	
		
		//"Apple".charAt(3); -> charAt String
		
		System.out.println("문자열의 길이: "+str.length());
		System.out.println("char 배열의 길이"+chArr.length);
		
		
		System.out.println("---------------------------");
		
		System.out.println("문자열의 세번째 글자"+str.charAt(2));
		System.out.println("char형의 두번째 글자"+chArr[4]);
		
		
		System.out.println("======================================");
		
		//문자열의 글자를 하나씩 출력하기
		
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println("==========================");
		
		//char 형 배열으이 글자를 하나씩 출력하기]
		for(int i=0;i<chArr.length;i++) {
			System.out.println(chArr[i]);
		}
		
		//------------------------------------------------
		char[] converted=str.toCharArray();
		
		//char[] - > String 변환 : new String()

		String restore=new String(converted);
		
	}
}






