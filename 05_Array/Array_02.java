package java05_array;

public class Array_02 {
	public static void main(String[] args) {
		
		int num=100; //변수의 선언과 동시에 초기화
		
		//#1
		int[] arr = {4,5,6,7,8};
		
		
//		//#2 #1과 같은 코드
//		int[] arr;
//		arr=new int[5];
//		arr[0]=4;
//		arr[1]=5;
//		arr[2]=6;
//		arr[3]=7;
//		arr[4]=8;
		
		//배열의 모든 요소(element)출력하기 ->  i 0~4 5번
		
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]); //배열출력
		}
		
		double[] dArr=new double[10];		//
			
		double[] dArr2= {1.1,2.2,3.3,4.4};	// double 형도 가능
		
		boolean[] bArr= {true, false};	//boolean 형도 배열 가능
		
		
	}

}
