package java04_control.switchCase;

import java.util.Scanner;

public class SwitchQuiz_Menu {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
//		System.out.println("메뉴 버튼 입력 ");
//		int menu=sc.nextInt();
		
		int menu = 0;
		
		final int HELLO_MENU=1;
		final int NAME_MENU=2;
		final int GENDER_MENU=3;
		final int END_MENU=4;
	

		
		
//		do -while로 처리 while(menu!=4) do 로 반복문 돌리기
		
		while(menu!=4) {
			System.out.println("=============================");
			System.out.println("메뉴를 입력하세요");
			System.out.println("1. helloworld입력");
			System.out.println("2. 이름출력");
			System.out.println("3. 성별출력");
			System.out.println("4. 종료");
			System.out.println("=============================");
			menu=sc.nextInt();
			System.out.println("=============================");

		
			switch(menu){
			
			case HELLO_MENU:
				System.out.println("helloworld");
				break;
			case NAME_MENU:
				System.out.println("최상옥");
				break;
			case GENDER_MENU:
				System.out.println("여성");
				break;
			case END_MENU:
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("잘못누르셨습니다");
				
			}
		}
		
	}

}
