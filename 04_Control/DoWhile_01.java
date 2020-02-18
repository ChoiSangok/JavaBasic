package java04_control.loop;

public class DoWhile_01 {
	public static void main(String[] args) {
		
		//do - while loop
		
//		do {
//			//반복 수행 코드 -> 일단 반복 수행 
		
//		}
//		while(조건식);
		
//		do {//출력 1번
//			System.out.println("실행될깡?");
//		}while(false);//조건검사
		
		//처음에 do 키워드를 만난 후 조건검사 없이 반복코드를 수행한다.
		//그 이후에 조건 검사하고 반복 진행
		
		//최초 1회를 무조건 실행하고 이 후 반복을 수행하는 loop
		
//		do {메뉴보여주는
//			메뉴선택하기
//			종료버튼을 선택하지 않으면 반복
//		
//			
//		}while(종료메뉴를 고르지 않았을때);
		
		//===================================================
		
		int i=0;//초기식
		
		
		while(i<5) {
			System.out.println(i);
			i++; //증감식
			
		}
		System.out.println("-----------------");
		
		int j=0;
		
		do {
			System.out.println(j);
			j++;	//증감식
			
		}while(j<5);//조건식
	}
}




