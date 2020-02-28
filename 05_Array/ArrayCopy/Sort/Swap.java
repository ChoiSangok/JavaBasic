package java05_array.sort;

public class Swap {
	public static void main(String[] args) {
		
		//스왑 swap 자리바꾸기
		
		int num1=11;
		int num2=22;
		
	
		
		System.out.println("[스왑 전] "+ num1+":"+num2);
		
		//swap
//		int temp=num2;
//		num2=num1;
//		num1=temp;
//		
		int temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("[스왑 후] "+num1+":"+num2);
	}

}
