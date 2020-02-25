package java05_array;

import java.util.Scanner;

public class ArrayQuiz_01 {
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		int[] arr1 = new int[5]; //각 층 인원 배열선언
		//new 로 만들면 
	
		//0
		//0.0
		//\n
		//false

		int[] arr2=new int[5]; // 각 층 금액 인원
		
		int sumperson = 0; //사람들 저장
		int summoney=0; //돈 저장
		
		int i;
	
		for(i=0;i<arr1.length;i++) {
			
			System.out.print(i+1 +" 층에 사는 인원은?"); //층에 사는 사람 입력
			arr1[i]=sc.nextInt();
			
			sumperson+=arr1[i]; //총 사람수 저장
			
			arr2[i]=arr1[i]*12000; //관리비 금액 저장
			summoney+=arr2[i]; //총 돈 저장

			
		}
		System.out.println("---------------------------------------");
		for(i=0;i<arr2.length;i++) { //관리비 총액 출력
			
			System.out.println(i+1+"층에 총 관리비는?"+arr2[i]);
		}
		

		System.out.println("");
		
		System.out.println("건물에 사는 총 인원은 "+sumperson+"명입니다.");
		System.out.println("관리비의 총 금액은 "+summoney+" 원 입니다");
		

	}

}
