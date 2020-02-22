package java04_control.switchCase;

public class Switch_01 {
	public static void main(String[] args) {
		
		//switch 문
		// 선택문
		// switch - case 문
		
		
//		switch(비교대상) {	//비교대상은 변수를 이용한다.
//		
//		case 값1:
//		case 값2:
//		case 값3:
//		case 값4:
//		case 값5: //case는 여러개 쓸 수 있다
//		default:
//			
//			
//		}
		
		int num=30;
		
		switch(num) {
		case 10:
			System.out.println("num은 10 입니다");
			break;
			
		case 20:
			System.out.println("num은 20 입니다");
			break;
			
		case 30:
			System.out.println("num은 30 입니다");
			break;
			
		default:
			System.out.println("다 아닙니다/");
				
		}
		//비교대상에 저장된 값과 case에 지정된 값이 같으면
		//해당 case구문 위치부터 아래쪽 코드 전부를 실행한다.
		
		//case에 지정한 값이 없으면 default로 간다.
		//default 는 case들 중에서 가장 마지막에 작성한다.
		
		//case마다 break; 를 적어서 해당 case부분만 실행되도록 만든다.
		
		//default 생략가능
		
		
	}

}
























