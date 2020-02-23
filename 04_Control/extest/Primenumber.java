package java04_control.extest;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
//		- 1에서부터 입력된 어떤 수까지 내에 있는 소수를
//		 찾는 프로그램을 작성하라.
//		   * 소수 = 1 과 자신의 숫자로만 나누어 떨어지는 수
//		   * ex) 2,3,5,7,11,13, ...
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오: ");
		int num=sc.nextInt(); //입력받는 숫자
		int prime; //소수 
		
		
		for(int i=2;i<=num;i++){//입력받는 num까지돌릴때 //소수가 아닐때 
			//소수가 1과 자신의 숫자만으로 나누어 떨어지는 수 
			prime=0; 
			for(int j=2 ; j<i ; j++) {
				if(i%j==0) { prime+=1; ;}
				//나머지가 0이며 소수 아니고
			}
			

			if(prime==0) {//소수아님
				System.out.print(i+" ");
			}
		}
		
		
	}
}
