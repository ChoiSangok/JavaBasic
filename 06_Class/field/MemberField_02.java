package java06_class.field;

public class MemberField_02 {

	//클래스 변수, (static)정적 변수, static 변수
	//정적변수는 무결성이 지켜지지 않음
	
	public static String city="Seoul";
//	private static String city="Seoul";
	
	//private getter 
	//정적메소드 ,static 메소드
	public static String getCity() {
		return city;
	} //MemberField_02.getCity();
	
	//-----------------------------------------------
	
	//정적메소드에서 인스턴스 변수 사용 불가
	
	private int num; //인스턴스 변수 -static 
	
	public static void test() { //정적메소드
//		System.out.println(num);
//		System.out.println(num);
	}
	
//=======================================================
	
	private static int num2; //정적 변수
	
	public void test2() {
		System.out.println(num2);
	}
	
}
