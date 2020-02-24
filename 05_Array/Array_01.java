package java05_array;

import java.util.Scanner;

public class Array_01 {
	public static void main(String[] args) {
		
		//배열 , array
		// 변수들의 묶음, 변수들의 나열
		Scanner sc=new Scanner(System.in);
		int num;
		num=123;
		
		//------------------------------
		
		int[] arr; //int 형 배열 변수 선언
		
		arr= new int[5]; //int형 배열 생성(5개의 int 형 공간, 배열)
		
		//배열 생성 시 변수공간 묶음(배열)이 만들어진다
		//배열을 생성하면서 변수공간의 개수를 정한다,
		
		//--------------------------------
		//배열의 저장공간에 값 대입
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
	
//		arr[5]=60; //여기에서 오류
		//arr 배열의 인덱스의 볌위인 0-4를 벗어난 5번째 공간에
		//대입하려고 시도해서 예외가 발생함.
		
		
		//배열 전체 대입
		for(int i=0;i<5;i++) {
			arr[i]=(i+1)*100;
		}
		
	
		//배열 전체 출력코드
		
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("------------------------------------");
		
		//배열의 이름은 메모리에 배열이 생성된 위치( 주소, 참조) 를 나타냄
		//-> 참조값 Reference
		
		System.out.println(arr); //[I@74a14482 -> int 형 배열이 74~에 저장되어있다 -> Reference
		

		
	}

}




