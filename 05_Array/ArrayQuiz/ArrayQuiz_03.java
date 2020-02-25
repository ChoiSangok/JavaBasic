package java05_array;

public class ArrayQuiz_03 {
	public static void main(String[] args) {
		
		//<3번>
		//- 위의 숫자를 높은 숫자가 1등이 되게하여
		//rank_arr라는 배열에 순위를 입력하시오
		//   => arr : { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 }
		//   => rank_arr :{  5,  3, 10,7,  1,  5, 9, 7,  4,  2 }
		
		
		int[] arr= { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 }; //시작 배열
		int[] rank_arr= {1,1,1,1,1,1,1,1,1,1}; //1로 초기화
		
		for(int i=0;i<arr.length;i++) {	// 배열 출력
			System.out.print(arr[i]+" ");
		}
	
	
		for(int i=0;i<arr.length;i++) { //rank for 문
	
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) { //비교해서 순위 올리기 작으면
					rank_arr[i]++;
				}
			}
		}
		System.out.println("");
		for(int i=0;i<arr.length;i++) {//rank 배열 출력
			System.out.print(rank_arr[i]+" ");
		}
	
		
		//System.out.print("=> arr: "+arr[i]);

		
	}
}

