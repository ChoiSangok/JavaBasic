package java05_array.array2D;

public class Array2D_03 {
	public static void main(String[] args) {
		
		int[][] arr=new int[3][]; //-> 참조
		
		//배열 reference
		//(int)[4] -> (int[])[3]
		
		//int[] arr=null; //아무것도 넣지 않을때 
		
//		System.out.println(arr[0][0]); //java.lang.NullPointerException 에러
		
		//---------------------------------------------
		
		
		
		arr[0] = new int [3];
		arr[1] = new int [3];
		arr[2] = new int [2];
		
		System.out.println(arr.length); // 3 arr이 나타ㅐㄴ느 길이 (행의길이)
		
		//---------------------------------
		System.out.println(arr[0].length); //3-> 참조해서 0번째 -> 한 번더 참조 (열의길이)
		System.out.println(arr[1].length); //3
		System.out.println(arr[2].length); //2
		
		System.out.println("--------------------------------------");
		
		//행마다 열의 길이가 일정하지 않은 2차원 배열의 출력
		
		for(int i=0;i<arr.length;i++) { //i행, 행 길이만큼 반복
			for(int j=0;j<arr[i].length;j++) {//j행 행마다 열길이 만큼
				System.out.println(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		
		
	}
}
