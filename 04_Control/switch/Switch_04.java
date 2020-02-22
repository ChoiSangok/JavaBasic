package java04_control.switchCase;


public class Switch_04 {
	public static void main(String[] args) {
		
		int num=30;
		
		if(num==10) {
			System.out.println("num은 10");
			
		}else if(num==20){
			System.out.println("num은 20 ");
			
		}else if(num==30) {
			System.out.println("num은 30 ");
			
		}else {
			System.out.println("num은 10 20 30 다 아님");			
		}

		System.out.println("-----------------------------------");
		
		int score=88;
		
		if(score>=90) {
			System.out.println("A");
		} else if(score>=80) {
			System.out.println("B");
		}
		
		//swtich 에서는 범위비교가 안된다.
		
//		switch(score/10)	{
//		case 10:
//		case 9:
//		case 9:
//		case 7:
//		case 6:
//		
//		}
	}
}


