package java04_control.condition;

import java.util.Scanner;

public class IfBasicQuiz_01 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("숫자 하나 입력");
		int num=scanner.nextInt();
		
		
		//양수 음수 판별 3의 배수 판별 
		
		if(num>0) {
			System.out.println("양수");
		}
		
		else if(num<0) {	//else 로 나타낼수있음
			System.out.println("음수");
		}

		if(num%3==0) { // 나머지 연산자 % 이용 3으로 나누었을때 나머지가 0 이면 3의 배수 "0" 

			System.out.println("3의배수");
		}
		else if (num%3!=0){ //else 로 나타내도 ..
			
			System.out.println("3의배수가 아니다");
			}

		//더 큰 수 나타내는 코드
		
		System.out.println("===========================");
		System.out.println("3번째 문제");
		System.out.println();
		
		//입력 받을 두 수 입력
		
		System.out.println("두 수 입력");
		int number1=scanner.nextInt();
		int number2=scanner.nextInt();
		
		
		if(number1>number2) {		//number1 이 더 클 경우
			System.out.println(number1 +" 이 더 큰 수");
		}		
		//number1이 큰 경우를 제외하고 나머지 경우
		else if(number1<number2)
		{
			System.out.println(number2 +" 이 더 큰 수 ");
		}
		else {System.out.println("같다");}	// 두 수가 같을 경우 else 로 분류

	}

}
