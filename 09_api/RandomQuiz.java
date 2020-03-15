package java09_api;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomQuiz {

	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);
		Random ran=new Random();
//		
//		System.out.println("사용자 입력 1,2,3 : ");
//		int use=user.nextInt(); //t사용자 입력
		
		//1이 가위 2가 바위 3이 보  
//		1 3 이김 
//		1 2 짐
//		2 3 이김
		
		int com;
		
		com=ran.nextInt(3)+1;
		
//		System.out.print("com값 출력: ");
	//	System.out.println(com);
		

		while(true) { //use가 1~3이 아닐때
			
			System.out.println("사용자 입력 1,2,3 : ");
			int use=user.nextInt(); //t사용자 입력
			System.out.print("com값 출력: ");
			System.out.println(com);
			if(use<1 && use>4) {break;}
			
	
			if(com-use==2||use-com==1) {
				System.out.println("사용자이김");
			}
			else if(use-com==2||com-use==1) {
				System.out.println("컴퓨터이김");
			}
			else if(use==com) {System.out.println("비겼습니다");}
			
		}
		
		
		
		
		
//		//2
//		else if(use>com) {
//			if(com==3) {
//				System.out.println("컴퓨터가 이겼습니다");
//			}
//			System.out.println("사용자가 이겼습니다");
//		}
//		
//		else if(use<com) {
//			
//			if(com==2) {
//				System.out.println("컴퓨터가 졌습니다");
//			}
//			System.out.println("사용자가 이겼습니다");
//		}
//		
		
		
		
	
			
			
	
		
		
		
		
		
	}

}
