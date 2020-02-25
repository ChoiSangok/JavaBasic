package java05_array;

public class ArrayQuiz_02_02 {

	public static void main(String[] args) {
		//<2번>
		//- 위의 숫자의
		//(짝수번째 인덱스 내용의 합) - (홀수번째 인덱스 내용의 합)을
		//구하시오
		//   => -5
				//  0  1  2 3  4  5 6 7  8  9 
		int[] arr= {10,17,3,9,27,10,8,9,13,21};
		int[] od=new int[1];
		int[] ed=new int[1];
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(i%2==0) {
				ed[0]+=arr[i];
			}
			else if(i%2==1) {
				od[0]+=arr[i];
			}
			
		}
	
		System.out.println(ed[0]-od[0]);
	
	}

}
