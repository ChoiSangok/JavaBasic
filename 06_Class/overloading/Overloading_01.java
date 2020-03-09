package java06_class.overloading;

public class Overloading_01 { //오버로딩 메소드 이름같고 
								//	매개변수가 다르면가능
							

	
	private int x;
	private int y; //?
	
			
	//멤버필드 x, y를 출력
	
	
	public void display() { //매개변수가 없는 display () 메소드
		
		System.out.println("("+ x + ","+ y +")");
	}
	
	//int 형 2개를 전달인자로 받아 멤버 x,y를 초기화 및 출력
	//?이게 get set
	public void display(int x, int y) {
		this.x = x;
		this.y = y;
		
//		System.out.println("("+ x + ","+ y +")");
		display();
		
	}
	
	//----------------------------------------
	
	
	public void display(double d) { }
	public void display(String str) { }
//	public void display(int i) { }
	
	//리턴타입만 바껴서는 오버로딩이 성립하지 않는다
//	public void display(int i) {
//		return i;
//	}
}







