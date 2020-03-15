package java09_api;

import java.util.Random;
import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);
		Random ran=new Random();
		

		
		
		int com=ran.nextInt(3)+1; //3개 까지만
		int bas; //베스킨 출력
		
		//컴퓨터도 3개까지 순서대로 랜덤함수 출력
		System.out.println("사용자 몇개 출력");
		int use=user.nextInt();
		
		for(int i=0;i<use;i++) {
			System.out.print(com+i+" ");
		}
		
		
		
	}
}
