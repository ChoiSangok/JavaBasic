package java09_api;

import java.util.Arrays;
import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		
		Random ran= new Random(); //랜덤 객체 생성
		
		
		System.out.println(ran.nextInt());
		System.out.println(ran.nextInt());
		System.out.println(ran.nextInt(100)); //0~99까지 
		
		
		
		System.out.println("--------------");
		
		

		
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextDouble()); //0.0.~ 1.0 미포함
		
		
		System.out.println("--------------");
		
		System.out.println(ran.nextInt(3));//0~2
		System.out.println(ran.nextInt(3)+1);//1~3
		
		System.out.println("--------------");
		
		int[] arr=new int[6];
		
		for(int i=0;i<arr.length;i++) {
			//중복제거
			
			arr[i]=ran.nextInt(45)+1;//1~45 //중복제거
			
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
			
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));//배열출력
		
		Arrays.sort(arr);
		
		
		
		
	}
}











