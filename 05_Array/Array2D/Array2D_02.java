package java05_array.array2D;

public class Array2D_02 {

	public static void main(String[] args) {
		
		//1차원 배열의 선언과 동시에 초기화
		
		int[] arr1D= {1,2,3,4,5}; //길이가 5인 배열이 생성
		//{ } -> 데이터의 묶음
		
		//2차원 배열의 선언과 동시에 초기화
		int[][] arr2D= {
				{1,2,3 }, 
				{4,5,6 },
				{7,8,9 }
			};
			//3행 3열 크기의 2차원 배열 생성(3x3)
		
		
		//2차원 배열의 값 대입하기
		for(int i=0;i<3;i++) {//i 0~2 3번
			for(int j=0;j<3;j++) {//j 0~2 3번 
				
				arr2D[i][j]=(i+1)*10+(j+1); //행과 열 대입
			}
			
		}
		
		//2차원 배열의 값 출력하기
		for(int i=0;i<3;i++) {//i 0~2 3번
			for(int j=0;j<3;j++) {//j 0~2 3번 
				
				System.out.print(arr2D[i][j]+" ");//i행 j열
			}
			System.out.println();
		}
		
		
	}
	
}
