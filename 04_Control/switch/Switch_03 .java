package java04_control.switchCase;

public class Switch_03 {
	public static void main(String[] args) {
		
		//switch 의 비교대상으로는 정수로 표현되는 값이어야 한다.
		
		//switch 에 double, boolean 형 사용할 수 없다.
		

		char alpha='B';
		
		switch(alpha) {
		case 'A':
			System.out.println("A입니다");
			break;
		case 'B':
			System.out.println("B입니다");
			break;
		case 'C':
			System.out.println("C입니다");
			break;
		}
	
	}

}
