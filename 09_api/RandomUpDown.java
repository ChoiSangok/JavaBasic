package java09_api;

import java.util.Random;
import java.util.Scanner;

public class RandomUpDown {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran=new Random();
		
//		System.out.print("사용자의 입력: ");
//		int user=sc.nextInt(); //사용자입력
		
		System.out.print("컴퓨터의 입력: ");
		int com=ran.nextInt(50)+1;//1부터 50
		System.out.println(com);
		
		
		for(int i=0;i<8;i++) {
	
			if(i==7) {System.out.println("컴퓨터승리"); break;}
			System.out.print("사용자의 입력: ");
			int user=sc.nextInt(); //사용자입력
		//	System.out.println(com);
			System.out.println();
			System.out.println((i+1)+" 번째입니다");

			
			if(com>user) {
				System.out.println("UP");
			}
			else if(com<user) {
				System.out.println("DOWN");
			}
			else if(com==user) {
				System.out.println("*** user 승리 ***"); break;
			}
		
//			else if(i==7) {System.out.println("컴퓨터승리");}
		}
//		System.out.println("컴퓨터의 승리");
	}
}
