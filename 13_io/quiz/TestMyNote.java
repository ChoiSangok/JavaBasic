package java13_io.quiz;

import java.util.Scanner;

public class TestMyNote {
	

	
	public static void main(String[] args) {
	
		while(true) {
			menu();
		}
		
	}
	
	public static void menu() {
		
		MyNote note = new MyNote(); //객체 생성
		
		Scanner sc=new Scanner(System.in); //scabnber
		

		
		
		System.out.println("번호입력: ");int menu=sc.nextInt(); //menu
		
			switch(menu) {
		
			case 1:
				System.out.println("1. 노트 새로만들기");
				note.fileSave();
				break;
			case 2:
				System.out.println("2. 노트 열어서 수정하기");
				note.fileOpen();
				break;
			case 3:
				System.out.println("3. 노트 수정하기");
				note.fileEdit();
				break;
			case 4:
				System.out.println("4. 끝내기");
				System.out.println("끝내야해맨~ ");
				
				break;
			
			default:
				System.out.println("아니야잘못눌렀다맨");
				break;
				
		
		}
				
		
	}

}
