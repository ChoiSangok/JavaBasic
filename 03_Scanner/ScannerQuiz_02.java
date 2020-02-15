package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_02 {

	public static void main(String[] args) {
		
		//테스트 하는 과정 하기 
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("====출력=====");
		
	
		String name=scanner.nextLine();
		int age=scanner.nextInt();
		scanner.nextLine();					//버퍼지우는 코드 버퍼에 있는 개행문자 \n 제거 
		
		String str=scanner.nextLine();
		char gender=str.charAt(0);	//string 으로 입력받고 charAt 으로 문자 뽑기
		
		int korean=scanner.nextInt();
		scanner.nextLine();					
		int english=scanner.nextInt();
		scanner.nextLine();	
		int math=scanner.nextInt();
		scanner.nextLine();	
	
		int score;
		double average;
		
		score=korean+math+english;		//총점
		
		average=score/3.0;				//평균\
		
		//출력
		System.out.println("----출력----");
		System.out.println("이름\t나이\t성별\t국어\t영어\t수학\t총점\t평균");
		System.out.print(name+"\t"+age+"\t"+gender+"\t"+korean+"\t"+english+"\t"+math+"\t"+score+"\t"+String.format("%.2f", average));
		
	
		
	}
}
