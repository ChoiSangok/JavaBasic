package java05_array;

public class ArrayQuiz_02 {
	public static void main(String[] args) {
		
		
		int[] arr= {10,17,3,9,27,10,8,9,13,21};
		
		
		int i;
	
		for(i=0;i<arr.length;i++) { //i출력
			System.out.print (arr[i]+" ");	
		}
		
		System.out.println("");
		System.out.println("invert arr");
		
	
		for(i=arr.length-1 ;0<=i;i--) {
			System.out.print(arr[i]+" ");
		}
	

	
	}

}
