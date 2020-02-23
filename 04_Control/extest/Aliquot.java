package java04_control.extest;

import java.util.Scanner;

public class Aliquot {
	public static void main(String[] args) {
		
//		- 어떤 수의 약수를 구하는 프로그램을 작성하여라
//		   약수 = 어떤 수를 정수로 나눌 수 있는 수
//			6 1 2 3 6 
		
		Scanner sc=new Scanner(System.in);
		
		int ali=sc.nextInt();
		
		for(int i=1;i<=ali;i++) {
			if(ali%i==0) {
				System.out.print(i+" ");
			}
			else {;}
		}
	}
}
