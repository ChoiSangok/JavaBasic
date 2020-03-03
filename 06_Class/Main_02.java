package java06_class;


//실행 클래스
public class Main_02 {
	public static void main(String[] args) {
		
		Class_02 c1=null;// 객체 변수 선언
		c1 = new Class_02();//객체 생성, 인스턴스화
		
		System.out.println(c1.num4); //public
		System.out.println(c1.num3); //protected
		System.out.println(c1.num2); //default
//		System.out.println(c1.num1); //private ->외부에서 접근 금지 main에서 접근 금지
		// 정보은닉
		
		
	}

}
