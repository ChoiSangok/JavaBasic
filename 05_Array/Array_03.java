package java05_array;

public class Array_03 {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		
		//배열의 요소의 개수: 5개 
		
		//배열의 길이 , 배열의 크기 : 5개 
		
		System.out.println("배열의 길이 : "+ arr.length); //배열의 길이 length
		
		
		
		System.out.println("=============================");
		
		//배열의 길이 를 이용한 배열 전체 출력 
		
		
		for(int i=0;i<arr.length;i++) {//i, 0-4, 5 i , 0~arr.length-1, arr.length
				System.out.println(arr[i]);
		}
		
		System.out.println("------------------------------");
		
		//arr의 인덱스 : 0-4
		
//		arr[5]=99; //예외 인덱스 값을 벗어나서 사용하면 예외 발생 java.lang.ArrayIndexOutOfBoundsException
		
//		arr[-4]=10; //에러 남 당연히~ java.lang.ArrayIndexOutOfBoundsException
		
		//java.lang.ArrayIndexOutOfBoundsException
		// arr.length 보다 크거나 같은 인덱스에 접근했을 때 발생
		// 0 번째 인덱스보다 작은 인덱스에 접근했을 경우 발생(음수)
		
		
		int[] arr2; //배열 선언
		
		arr2= new int[-5];//배열 생성 (음수) 
		
		//java.lang.NegativeArraySizeException
		// 배열을 생성할 때 크기를 음수로 지정하면 발생하는 예외 -> 잘 나오는 에러

	}

}










