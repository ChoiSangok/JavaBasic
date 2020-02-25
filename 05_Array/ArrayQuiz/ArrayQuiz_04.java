package java05_array;

public class ArrayQuiz_04 {
	public static void main(String[] args) {
		
		
		int[] arr= { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 }; //시작 배열
		
		int[] arr2= new int[10]; //같은 배열을 저장하는 변수
		
		int[] ret_arr= new int[10]; //e다른배열 저장
		
		int count=0;
		//int[] rank_arr= { }; //1로 초기화
		//- 중복된 값은 over_arr에 넣고 중복되지
		//않은 값은 ret_arr에 입력하시오
		//
		//   정렬까지 했다면
		//   => over_arr : { 9, 10 }
		//   => ret_arr : { 3, 8, 13, 17, 21, 27 }
		
	

		for(int i=0;i<arr.length;i++) { //배열 돌리기
			
			for(int j=i+1;j<arr.length;j++) { //다음꺼랑 비교할수있도록 +1
				if(arr[i]==arr[j]) { //같으면 배열 저
					arr2[i]=arr[j];
				}

			}
		}
		
		//출력
		for(int j=0;j<arr.length;j++) {
			if(arr2[j]!=0) {
				System.out.print(arr2[j]+" ");

			}
	
		}
		
		
		
		System.out.println("");
		//ret_Array
		int sw=1;
		
		for(int i=0;i<arr.length;i++) { //배열 arr돌리고
			
			for(int j=0;j<arr2.length;j++) { //다음거 돌리수있게 하고				
				if(arr[i]==arr2[j]) { //같지 않다면
					sw=0;
					break;
				}
				
			}
			if(sw==1) {
				ret_arr[i]=arr[i];
			}
			sw=1;
			//System.out.print(ret_arr[i]);
		}
		
		for(int j=0;j<arr.length;j++) {
			if(arr2[j]==0) {
			System.out.print(ret_arr[j]+" ");
			}
		}

	
	}

}
